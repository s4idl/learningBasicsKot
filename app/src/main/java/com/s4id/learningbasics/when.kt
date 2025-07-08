package com.s4id.learningbasics

fun main(){
    getMonth(month = 2)
}
fun getSemester(month: Int)= when(month){
        in 1..6 -> "Este es el primer semstre"
        in 7..12 -> "Este es el segundo semestre"
        else -> "Semestre no valido"
    }

fun getTrimester(month:Int){
    when(month){
        1, 2, 3 -> println("Este es el primer trimestre")
        4, 5, 6 -> println("Este es el segundo trimestre")
        7, 8, 9 -> println("Este es el tercer trimestre")
        10, 11, 12 -> println("Este es el cuarto semestre")
        else -> println("Trimestre no valido")

    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> {
            println("Febrero")
            println("solo tiene 28 dias")
        }
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes valido")
    }
}

