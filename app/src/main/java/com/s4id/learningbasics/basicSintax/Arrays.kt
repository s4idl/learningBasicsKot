package com.s4id.learningbasics.basicSintax

fun main(){
    val weekDays = arrayOf("Lunes", "Marte", "MIercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays[0] = "Ya no eres el mismo, si ya cambie"
    println(weekDays[0])

    if(weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("Ya no hay valores")
    }

    //Bucles Arrays
    for(postion in weekDays.indices){
        println("He cambiado $postion veces")
    }

    for((position, value)in weekDays.withIndex()){
        println("La posicion $position, contiene $value")
    }

    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}