package com.example.laboratorio5_navigationcomponent.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.laboratorio5_navigationcomponent.R
import com.example.laboratorio5_navigationcomponent.databinding.FragmentCreateMovieBinding
import com.example.laboratorio5_navigationcomponent.databinding.FragmentMovieBinding
import com.example.laboratorio5_navigationcomponent.ui.movie.viewModel.MovieViewModel

class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding

    private val movieViewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = movieViewModel
        binding.lifecycleOwner = viewLifecycleOwner
    }
}
