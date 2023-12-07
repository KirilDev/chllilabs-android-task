package com.youngdev.giphysearchapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.youngdev.giphysearchapp.databinding.GifItemBinding

class GiphyAdapter: RecyclerView.Adapter<GiphyAdapter.GiphyViewHolder>() {

    inner class GiphyViewHolder(binding: GifItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GiphyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GiphyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}