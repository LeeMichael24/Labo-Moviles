package com.example.laboratorio5_navigationcomponent.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.laboratorio5_navigationcomponent.databinding.FragmentCreateMovieBinding

class CreateMovieFragment : Fragment() {

    private val movieViewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    private lateinit var binding: FragmentCreateMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCreateMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setViewModel()
        observerStatus()
    }

    private fun setViewModel() {
        binding.viewModel = movieViewModel
    }

    private fun observerStatus() {
        movieViewModel.status.observe(viewLifecycleOwner) { status ->
            when {
                status.equals(MovieViewModel.WRONG_INFORMATION) -> {
                    Log.d("TESTAPP", status)
                    movieViewModel.clearStatus()
                }

                status.equals(MovieViewModel.MOVIEW_CREATED) -> {
                    Log.d("TESTAPP", status)
                    Log.d("TESTAPP", movieViewModel.getMovies().toString())

                    movieViewModel.clearStatus()
                    findNavController().popBackStack()
                }
            }
        }
    }

    companion object {
        const val APP_TAG = "TESTAPP"
    }
}