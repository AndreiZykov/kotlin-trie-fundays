package com.azykov

class TrieNode {

    private val branches: Array<TrieNode?> = arrayOfNulls(26)

    private var _isLeaf: Boolean = false

    val isLeaf: Boolean
        get() = _isLeaf

    fun get(ch: Char): TrieNode? = branches[ch - 'a']

    fun put(ch: Char, node: TrieNode): TrieNode {
        branches[ch - 'a'] = node
        return node
    }

    fun setLeaf() {
        _isLeaf = true
    }

}