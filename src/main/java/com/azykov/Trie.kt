package com.azykov

class Trie {

    private val root = TrieNode()

    fun search(word: String): Boolean = searchPrefix(word)?.isLeaf ?: false

    fun startsWith(word: String): Boolean = searchPrefix(word) != null

    fun insert(word: String){
        var node: TrieNode = root
        word.forEach { node = node.get(it) ?: node.put(it, TrieNode()) }
        node.setLeaf()
    }

    private fun searchPrefix(word: String): TrieNode? {
        var node = root
        word.forEach { node = node.get(it) ?: return null }
        return node
    }

}