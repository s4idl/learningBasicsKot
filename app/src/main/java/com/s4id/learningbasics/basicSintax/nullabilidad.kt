package com.s4id.learningbasics.basicSintax

fun main(){
    var name:String? = "Said" //null

    println(name?.get(2) ?: "Es null")
}