package com.example.laboratorio5_navigationcomponent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboratorio5_navigationcomponent.R
import com.example.laboratorio5_navigationcomponent.databinding.ActivityMainBinding
import com.example.laboratorio5_navigationcomponent.databinding.FragmentMovieBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = ActivityMainBinding.inflate(inflater, container, false)
        return binding.root
    }
}