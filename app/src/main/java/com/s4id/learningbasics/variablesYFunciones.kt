package com.s4id.learningbasics

//Int
val age:Int = 30
var age2:Int = 19

//string
val stringExample:String = "Hola aprendiendo"
val stringExample2: String = "Its going to rain"

fun main(){
    showMyName(currentName = "Roy")
    showMyAge(currentAge = 21)
    add (25, 45)
    val mySubstract = substracCool(10,6)
    print(mySubstract)
}

fun showMyName(currentName:String) {
    println("Me llamo $currentName")
}

fun showMyAge(currentAge:Int = 20 ) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun substracCool(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber


fun variablesBoolean(){
    //booolean

    val booleanExample0:Boolean = true
    val booleanExample1:Boolean = false

    var stringConcatenada:String = "hOLA"
    println(stringConcatenada)
    stringConcatenada = "hOLA me llamo roy y $stringExample2 y tengo $age2 años"
    println(stringConcatenada)

    val example123:String = age.toString()
}

fun variablesAlfanumericas(){
    // Float
    val floatExample:Float = 30.5f

    //Double
    //Long

    //alfanumericos

    //char
    val charExample:Char = 's'
}