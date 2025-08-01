package com.s4id.learningbasics.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.s4id.learningbasics.R

class CategoriesAdapter(private val categories:List<TaskCategory>) : RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_categorie, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun getItemCount(): Int = categories.size


    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}