package name.seguri.android.thumbkey.autocomplete

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

object AutoCompleteEngine {
    private val _suggestions = MutableStateFlow<List<String>>(emptyList())
    val suggestions = _suggestions.asStateFlow()

    init {
        CoroutineScope(Dispatchers.Default).launch {
            KeyEventEmitter.currentWord.collect { word ->
                _suggestions.value = when (word.length) {
                    0 -> emptyList()
                    else -> getSuggestions(word)
                }
            }
        }
    }

    private fun getSuggestions(word: String): List<String> {
        // Random number between 1 and 5
        val random = (1..5).random()

        // Return a list of strings
        return (1..random).map { "${word}${it}" }
    }
}