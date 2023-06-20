package com.example.laboratorio11.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.laboratorio11.R
import com.example.laboratorio11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nagvHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = nagvHostFragment.navController

    }
}