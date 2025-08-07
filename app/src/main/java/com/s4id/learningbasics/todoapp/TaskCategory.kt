package com.s4id.learningbasics.todoapp

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal: TaskCategory()
    object Bussines: TaskCategory()
    object Other: TaskCategory()
}

