package com.example.topdownloaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.concurrent.fixedRateTimer


class RVA (private val items:ArrayList<FeedEntry>): RecyclerView.Adapter<RVA.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    }
    // for binding
    lateinit var tvFeed : TextView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_row,
            parent,
            false
        )
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holderMy: MyViewHolder, position: Int) {
        val title =items[position].name
        holderMy.itemView.apply{
                tvFeed = findViewById(R.id.feed_tv)
                tvFeed.text = title
        }
    }
    override fun getItemCount() = items.size
}