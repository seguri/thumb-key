package name.seguri.android.thumbkey.autocomplete

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import name.seguri.kotlin.ds.Trie

object AutoCompleteEngine {
    private const val MAX_SUGGESTIONS = 5
    private val trie = Trie(Dictionaries.IT.words)
    private val _suggestions = MutableStateFlow<List<Suggestion>>(emptyList())
    val suggestions = _suggestions.asStateFlow()

    init {
        CoroutineScope(Dispatchers.Default).launch {
            KeyEventEmitter.currentWord.collect { word ->
                _suggestions.value = when {
                    word.isEmpty() -> emptyList()
                    else -> getSuggestions(word)
                }
            }
        }
    }

    private fun getSuggestions(currentWord: String): List<Suggestion> {
        return trie.getSuggestions(currentWord).map { fullWord ->
            Suggestion(
                fullWord = fullWord,
                completion = fullWord.substring(currentWord.length)
            )
        }.take(MAX_SUGGESTIONS)
    }
}