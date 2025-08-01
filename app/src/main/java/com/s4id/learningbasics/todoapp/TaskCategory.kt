package com.s4id.learningbasics.todoapp

sealed class TaskCategory {
    object Personal: TaskCategory()
    object Bussines: TaskCategory()
    object Other: TaskCategory()
}

