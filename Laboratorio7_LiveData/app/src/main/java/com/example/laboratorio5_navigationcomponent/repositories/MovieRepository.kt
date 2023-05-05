package com.example.laboratorio5_navigationcomponent.repositories

import com.example.laboratorio5_navigationcomponent.data.models.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {

    fun getMovies() = movies

    fun addMovies(movie: MovieModel) = movies.add(movie)
}