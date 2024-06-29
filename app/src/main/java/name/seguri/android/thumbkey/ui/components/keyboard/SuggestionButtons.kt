package name.seguri.android.thumbkey.ui.components.keyboard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import name.seguri.android.thumbkey.autocomplete.AutoCompleteEngine

@Composable
fun SuggestionButtons() {
    val suggestions by AutoCompleteEngine.suggestions.collectAsState()

    suggestions.forEach { SuggestionButton(it) }
}