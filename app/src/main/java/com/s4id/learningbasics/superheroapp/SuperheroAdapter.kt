package com.s4id.learningbasics.superheroapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.s4id.learningbasics.R

class SuperheroAdapter(var superHeroList:List<SuperHeroItemResponse> = emptyList()): RecyclerView.Adapter<SuperheroViewHolder>() {

    fun updateList(superHeroList: List<SuperHeroItemResponse>){
        this.superHeroList = superHeroList
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperheroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount() = superHeroList.size

    override fun onBindViewHolder(viewholder: SuperheroViewHolder, position: Int) {
        viewholder.bind(superHeroList[position])
    }

}