package com.example.android.marsrealestate.overview

import androidx.recyclerview.widget.RecyclerView
import com.example.android.marsrealestate.databinding.GridViewItemBinding
import com.example.android.marsrealestate.network.MarsProperty

class MarsPropertyViewHolder(private val binding: GridViewItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(marsProperty: MarsProperty) {
        binding.property = marsProperty
        binding.executePendingBindings()
    }
}
