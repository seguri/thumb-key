# Thumb-Key

This fork displays autocompletion on the left of the keyboard.

## TODO

- [x] Move app to a new package
- [x] Display static text on the left of the keyboard
- [x] Insert static text where the cursor is
- [ ] Display dynamic text based on user-input on the left of the keyboard
- [ ] Import a working Kotlin Trie (prefix-tree) implementation
- [ ] Load a dictionary of desired words (e.g. "comunque", "perché", etc.) 
- [ ] Display autocompletion on the left of the keyboard
- [ ] Properly insert autocompletion
  - If you really only complete words, just insert what remains of the word
    - No need to manage capitalization as you will never start from the beginning of a word
  - If you wanna do something smart like replacing "xk" with "perché", you must delete existing text