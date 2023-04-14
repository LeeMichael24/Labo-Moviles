package com.example.laboratorio04_lifecicle

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var editNumber: EditText
    private lateinit var sendBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        evenListener()
    }

    fun bind() {
        editName = findViewById(R.id.textName)
        editEmail = findViewById(R.id.textEmail)
        editNumber = findViewById(R.id.editNumber)
        sendBtn = findViewById(R.id.saveBtn)
    }

    fun evenListener() {
        sendBtn.setOnClickListener{
            val name = editName.text.toString()
            val email = editEmail.text.toString()
            val number =editNumber.text.toString()

            var intent = Intent(this, secondActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email )
            intent.putExtra("number", number)
            startActivity(intent)
        }
    }
}