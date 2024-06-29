# Thumb-Key

This fork displays autocompletion on the left of the keyboard.

## TODO

- [x] Move app to a new package
- [x] Display static text on the left of the keyboard
- [x] Insert static text where the cursor is
- [ ] Define an AutoCompleteEngine that receives input events
- [ ] The engine must be able to distinguish between a new word and a new character in the current word 
- [ ] Display five dynamic text based on the current word ("wor1", "wor2", etc.)
- [ ] Import a working Kotlin Trie (prefix-tree) implementation
- [ ] The engine must send the word to be displayed in the button and the text to be entered on click (suggestion minus what has been typed)
  - If you really only complete words, just insert what remains of the word
    - No need to manage capitalization as you will never start from the beginning of a word
  - If you wanna do something smart like replacing "xk" with "perché", you must delete existing text
    - Probably a series of `if` before passing the current word to the Trie