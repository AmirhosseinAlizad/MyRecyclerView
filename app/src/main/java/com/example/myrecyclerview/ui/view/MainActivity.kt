package com.example.myrecyclerview.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.myrecyclerview.R
import com.example.myrecyclerview.databinding.ActivityMainBinding
import com.example.myrecyclerview.ui.adapter.CardAdapter
import com.example.myrecyclerview.utils.FakeData

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: CardAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindViews()
    }

    private fun bindViews() {
        adapter = CardAdapter(FakeData.cardData)
        binding.recyclerView.apply {
            adapter = adapter
            layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        }
    }
}