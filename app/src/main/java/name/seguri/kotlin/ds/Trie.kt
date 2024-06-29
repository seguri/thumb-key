package name.seguri.kotlin.ds

class Trie(words: List<String> = emptyList()) {
  private val root: TrieNode = TrieNode()

  init {
    words.forEach { addWord(it) }
  }

  fun getSuggestions(partialWord: String): List<String> {
    val result = mutableListOf<String>()
    val partialWordNode = getLastNode(partialWord) ?: return result
    dfs(partialWordNode, partialWord, result)
    return result
  }

  private fun addWord(word: String) {
    var curr = root
    word.forEach { curr = curr.children.getOrPut(it) { TrieNode() } }
    curr.isEndOfWord = true
  }

  private fun getLastNode(word: String): TrieNode? {
    return word.fold(root) { curr, char -> curr.children[char] ?: return null }
  }

  private fun dfs(node: TrieNode, partialWord: String, results: MutableList<String>) {
    if (node.isEndOfWord) {
      results.add(partialWord)
    }
    node.children.forEach { (nextChar, nextCharNode) ->
      dfs(nextCharNode, partialWord + nextChar, results)
    }
  }

  class TrieNode {
    val children = mutableMapOf<Char, TrieNode>()
    var isEndOfWord = false
  }
}
