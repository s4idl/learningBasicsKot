package com.s4id.learningbasics

fun main(){
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifInt()
    ifMultiple()
    ifMultipleOR()
}
fun ifMultipleOR(){
    var animal1 = "gato"
    var isHappy = true

    if(animal1 =="perro" || animal1 == "gato" && isHappy){
        println("Es un perro")
    }
}
fun ifMultiple(){
    var age1 = 21
    var permisoPapas = true

    if(age1 >= 21 && permisoPapas){
        println("festeja")
    }
}
fun ifInt(){
    var age = 19

    if(age >= 20){
        println("cerveza para ti")
    }else{
        println("no cerveza para ti")
    }
}
fun ifBoolean(){
    var estoyHappy:Boolean = true

    if (!estoyHappy){
        println("Estoy sad:(")
    }
}
fun ifAnidado(){
    val animal = "capibara"
    if(animal == "perro"){
        println("es un perro")
    }else if(animal == "gato"){
        println("El animal es un gato")
    }else if(animal == "capibara"){
        println("El animal es un capibara")
    }else{
        println("No es valido ese animal")
    }
}
fun ifBasico(){
    val name = "said"

    if(name == "pepe"){
        println("oye tu numbre si es said")
    }else {
        println("tu no eres said")
    }
}