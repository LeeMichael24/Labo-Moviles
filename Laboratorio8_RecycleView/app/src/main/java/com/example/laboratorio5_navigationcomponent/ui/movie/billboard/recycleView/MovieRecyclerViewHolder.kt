package com.example.laboratorio5_navigationcomponent.ui.movie.billboard.recycleView

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio5_navigationcomponent.data.models.MovieModel
import com.example.laboratorio5_navigationcomponent.databinding.MovieItemBinding

class MovieRecyclerViewHolder(private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit ) {
        binding.textView5.text = movie.name
        binding.textView6.text = movie.qualification

        binding.movieItemCardView.setOnClickListener {
            clickListener(movie)
        }
    }
}