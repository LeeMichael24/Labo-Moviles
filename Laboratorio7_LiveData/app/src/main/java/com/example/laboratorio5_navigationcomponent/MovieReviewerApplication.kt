package com.example.laboratorio5_navigationcomponent

import android.app.Application
import com.example.laboratorio5_navigationcomponent.data.models.movies
import com.example.laboratorio5_navigationcomponent.repositories.MovieRepository

class MovieReviewerApplication: Application() {

    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}