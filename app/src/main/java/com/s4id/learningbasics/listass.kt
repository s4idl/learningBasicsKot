package com.s4id.learningbasics

import kotlin.math.sin

fun main(){
    //sinCambiosList()
    mutableList()
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "MIercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(1,"SaidDay")
    println(weekDays)

    if(weekDays.isEmpty()){
        //NADAAAA
    }else{
        weekDays.forEach{ println(it) }
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach{ println(it) }
    }

    weekDays.last()
}


fun sinCambiosList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "MIercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly.size)
    println(readOnly.last())

    //Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }
}