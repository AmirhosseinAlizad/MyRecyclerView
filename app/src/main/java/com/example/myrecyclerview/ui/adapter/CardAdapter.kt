package com.example.myrecyclerview.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.myrecyclerview.data.model.CardModel
import com.example.myrecyclerview.databinding.ItemCardBinding

class CardAdapter(val model: List<CardModel>) : Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(
            ItemCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindViews(model[position])
    }

    override fun getItemCount(): Int =model.size
}