package name.seguri.android.thumbkey.ui.components.keyboard

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun SuggestionButton(
    text: String,
    onClick: () -> Unit = {}
) {
    Button(onClick = onClick) {
        Text(
            text,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}