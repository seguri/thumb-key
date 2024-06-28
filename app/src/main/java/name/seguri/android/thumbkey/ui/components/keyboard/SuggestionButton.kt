package name.seguri.android.thumbkey.ui.components.keyboard

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import name.seguri.android.thumbkey.IMEService

@Composable
fun SuggestionButton(text: String) {
    val ctx = LocalContext.current
    val ime = remember { ctx as IMEService }

    Button(onClick = { onClick(text, ime) }) {
        Text(
            text,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

private fun onClick(text: String, ime: IMEService) {
    ime.ignoreNextCursorMove()
    ime.currentInputConnection.commitText(text, 1)
}