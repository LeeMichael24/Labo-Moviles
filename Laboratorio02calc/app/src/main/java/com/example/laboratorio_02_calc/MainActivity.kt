package com.example.laboratorio_02_calc

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.system.Os.bind
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.graphics.toColorInt

class MainActivity : AppCompatActivity() {

    private lateinit var EditTextWeight: EditText
    private lateinit var EditTextHeight: EditText
    private lateinit var Button_calculate: Button
    private lateinit var Show_Text_Calc:TextView
    private lateinit var sobre_peso:TextView
    private lateinit var sobre_peso_new:TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()

        Button_calculate.setOnClickListener {
            val height = EditTextHeight.text.toString()
            val weight = EditTextWeight.text.toString()

            if(!validateInput(weight, height)){
                return@setOnClickListener
            }
            else {

                var result = calculateBMI(weight.toFloat(), weight.toFloat())
                Show_Text_Calc.text = result.toString()

                if (result < 18.5) {
                    Show_Text_Calc.text = result.toString();
                    sobre_peso.setTextColor(Color.RED)
                    sobre_peso.text = "UnderWeight"
                    var sobre_peso_New = "You are a bit pass of above weight!"
                    sobre_peso_new.text = sobre_peso_New.toString()

                }
                else if (result < 24.9){
                    Show_Text_Calc.text = result.toString()
                    sobre_peso.setTextColor(Color.GREEN)
                    sobre_peso.text = "In Shape!!"
                    var sobre_peso_Var = "You are perfect, keep going !!"
                    sobre_peso_new.text = sobre_peso_Var.toString()
                }
                else if (result < 30){
                    Show_Text_Calc.text = result.toString()
                    sobre_peso.setTextColor(Color.GREEN)
                    sobre_peso.text = "OverWeight"
                    var sobre_peso_New = "Upps,It seems you are overweight"
                    sobre_peso_new.text = sobre_peso_New.toString()
                }
            }
        }

    }

    private fun bind() {
        EditTextWeight = findViewById(R.id.text_wgt)
        EditTextHeight = findViewById(R.id.text_hgt)
        Button_calculate = findViewById(R.id.btn_calculate)
        Show_Text_Calc = findViewById(R.id.text_shown)
        sobre_peso = findViewById(R.id.sobrePesoText)
        sobre_peso_new = findViewById(R.id.sobPesoText2)
    }

    private fun calculateBMI(weight: Float, height: Float): Float {
        return weight / ((height/100) * (height/100))
    }

    private fun validateInput(weight: String?, height: String?): Boolean {
        return when {
            weight.isNullOrEmpty() -> {
                Toast.makeText(this, "Weight is empty", Toast.LENGTH_SHORT).show()
                return false;
            }
            height.isNullOrEmpty() -> {
                Toast.makeText(this, "Height is empty", Toast.LENGTH_SHORT).show()
                return false;
            }

            else -> true
        }
    }


}
