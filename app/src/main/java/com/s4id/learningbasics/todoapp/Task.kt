package com.s4id.learningbasics.todoapp

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false )