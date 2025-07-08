package com.s4id.learningbasics

fun main(){
    var name:String? = "Said" //null

    println(name?.get(2) ?: "Es null")
}