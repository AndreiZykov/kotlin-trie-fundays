package com.azykov

fun main(){

    val trie = Trie()

    trie.insert("home")
    trie.insert("homework")
    trie.insert("homeland")
    trie.insert("hope")

    println("is \"home\" in trie: ${trie.search("home")}" )
    println("is \"hope\" in trie: ${trie.search("hope")}" )
    println("is \"house\" in trie: ${trie.search("house")}" )

}