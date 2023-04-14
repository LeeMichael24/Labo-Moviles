package com.example.laboratorio04_lifecicle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val name = intent.getStringExtra("name").toString()
        val textName = findViewById<TextView>(R.id.rcName)
        textName.text = name


        val email = intent.getStringExtra("email").toString()
        val textEmail = findViewById<TextView>(R.id.rcEmail)
        textEmail.text = email


        val number =intent.getStringExtra("number").toString()
        val textNumber = findViewById<TextView>(R.id.rcNumber)
        textNumber.text = number

        val ShareBtn = findViewById<Button>(R.id.ShareBtn)
        ShareBtn.setOnClickListener {
            val name = intent.getStringExtra("name").toString()
            val email = intent.getStringExtra("email").toString()
            val number = intent.getStringExtra("number").toString()
            val intentShare = Intent()
            intentShare.action = Intent.ACTION_SEND
            intentShare.putExtra(Intent.EXTRA_TEXT, "$name \n, $email \n, $number \n")
            intentShare.type = "text/plain"
            startActivity(Intent.createChooser(intentShare, "Share vía"))
        }
    }
}