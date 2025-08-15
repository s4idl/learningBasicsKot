package com.s4id.learningbasics.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.s4id.learningbasics.databinding.ItemSuperheroBinding

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)
    fun bind(superHeroItemResponse: SuperHeroItemResponse){
        binding.tvSuperheroName.text = superHeroItemResponse.name
    }
}