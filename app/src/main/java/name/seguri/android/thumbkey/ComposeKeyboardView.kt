package name.seguri.android.thumbkey

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.lifecycle.lifecycleScope
import name.seguri.android.thumbkey.db.AppSettingsRepository
import name.seguri.android.thumbkey.ui.components.keyboard.KeyboardScreen
import name.seguri.android.thumbkey.ui.theme.ThumbkeyTheme
import name.seguri.android.thumbkey.utils.keyboardLayoutsSetFromDbIndexString
import kotlinx.coroutines.launch

@SuppressLint("ViewConstructor")
class ComposeKeyboardView(
    context: Context,
    private val settingsRepo: AppSettingsRepository,
) :
    AbstractComposeView
        (context) {
    @Composable
    override fun Content() {
        val settingsState = settingsRepo.appSettings.observeAsState()
        val settings by settingsState
        val ctx = context as IMEService

        ThumbkeyTheme(
            settings = settings,
        ) {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
                KeyboardScreen(
                    settings = settings,
                    onSwitchLanguage = {
                        ctx.lifecycleScope.launch {
                            // Cycle to the next keyboard
                            val state = settingsState.value
                            state?.let { s ->

                                val layouts =
                                    keyboardLayoutsSetFromDbIndexString(s.keyboardLayouts).toList()
                                val currentLayout = s.keyboardLayout
                                val index = layouts.map { it.ordinal }.indexOf(currentLayout)
                                val nextIndex = (index + 1).mod(layouts.size)
                                val nextLayout = layouts.getOrNull(nextIndex)
                                nextLayout?.let { layout ->
                                    val s2 = s.copy(keyboardLayout = layout.ordinal)
                                    settingsRepo.update(s2)

                                    // Display the new layout's name on the screen
                                    val layoutName = layout.keyboardDefinition.title
                                    Toast.makeText(context, layoutName, Toast.LENGTH_SHORT)
                                        .show()
                                }
                            }
                        }
                    },
                    onSwitchPosition = {
                        ctx.lifecycleScope.launch {
                            // Cycle to the next position
                            val state = settingsState.value
                            state?.let { s ->
                                val nextPosition = (s.position + 1).mod(3)
                                val s2 = s.copy(position = nextPosition)
                                settingsRepo.update(s2)
                            }
                        }
                    },
                )
            }
        }
    }
}
