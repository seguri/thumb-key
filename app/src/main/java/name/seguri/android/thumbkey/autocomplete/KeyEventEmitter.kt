package name.seguri.android.thumbkey.autocomplete

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

object KeyEventEmitter {
    private val _keyEvents = MutableSharedFlow<Char>()
    val keyEvents = _keyEvents.asSharedFlow()

    private val _currentWord = MutableStateFlow("")
    val currentWord = _currentWord.asStateFlow()

    fun emitKeyEvent(char: Char) {
        CoroutineScope(Dispatchers.Default).launch {
            _keyEvents.emit(char)
            updateCurrentWord(char)
        }
    }

    private fun updateCurrentWord(char: Char) {
        when {
            char.isLetter() -> _currentWord.value += char.lowercaseChar()
            char == '\u007F' -> _currentWord.value = _currentWord.value.dropLast(1)
            else -> _currentWord.value = ""
        }
    }
}