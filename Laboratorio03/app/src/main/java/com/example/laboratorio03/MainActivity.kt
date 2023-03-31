package com.example.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {
    private lateinit var fiveCents: ImageView
    private lateinit var tenCents: ImageView
    private lateinit var twentyCents: ImageView
    private lateinit var juanDollar: ImageView
    private lateinit var counterView: TextView
    var FiveCentss = 0.05
    var TenCentss = 0.10
    var TwentyCentss = 0.25
    var JuanDollarr = 1
    var totalCents = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        evenListener()
    }

    fun bind() {
        fiveCents = findViewById(R.id.five_cents_image_view)
        tenCents = findViewById(R.id.ten_cents_image_view)
        twentyCents = findViewById(R.id.twenty_cents_image_view)
        juanDollar = findViewById(R.id.one_cents_image_view)
        counterView = findViewById(R.id.CounterView)
    }
    fun evenListener() {
        fiveCents.setOnClickListener{
            totalCents = totalCents + FiveCentss
            totalCents = (totalCents * 100.0).roundToInt() /100.0
            counterView.text = totalCents.toString()
        }
        tenCents.setOnClickListener{
            totalCents = totalCents + TenCentss
            totalCents = (totalCents * 100.0).roundToInt() /100.0
            counterView.text = totalCents.toString()
        }
        twentyCents.setOnClickListener{
            totalCents = totalCents + TwentyCentss
            counterView.text = totalCents.toString()
        }
        juanDollar.setOnClickListener{
            totalCents = totalCents + JuanDollarr
            counterView.text = totalCents.toString()
        }
    }
}

