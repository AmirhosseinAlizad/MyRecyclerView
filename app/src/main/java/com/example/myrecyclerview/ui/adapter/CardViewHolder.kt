package com.example.myrecyclerview.ui.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myrecyclerview.data.model.CardModel
import com.example.myrecyclerview.databinding.ItemCardBinding
import com.squareup.picasso.Picasso

class CardViewHolder(val binding: ItemCardBinding) : ViewHolder(binding.root) {
    fun bindViews(model: CardModel) {
        binding.username.text = model.username
        Picasso.get().load(model.image).into(binding.profile)
    }
}