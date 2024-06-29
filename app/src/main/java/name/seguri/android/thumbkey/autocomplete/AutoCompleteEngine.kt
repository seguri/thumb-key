package name.seguri.android.thumbkey.autocomplete

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import name.seguri.kotlin.ds.Trie

object AutoCompleteEngine {
    private val trie = Trie(Dictionaries.IT.words)
    private val _suggestions = MutableStateFlow<List<String>>(emptyList())
    val suggestions = _suggestions.asStateFlow()

    init {
        CoroutineScope(Dispatchers.Default).launch {
            KeyEventEmitter.currentWord.collect { word ->
                _suggestions.value = when (word.length) {
                    0 -> emptyList()
                    else -> trie.getSuggestions(word)
                }
            }
        }
    }
}