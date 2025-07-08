package com.s4id.learningbasics.exercises
//Ejercicio de notifcaciones

fun main(){
    val morningNotification = 51
    val eveningNotification = 123

   // printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages >= 100){
        println("Tienes +99 mensajes apaga eso DND")
    }else{
        println("Tienes $numberOfMessages mensajes")
    }
}