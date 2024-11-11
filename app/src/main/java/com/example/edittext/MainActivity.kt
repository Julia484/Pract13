package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.hypot
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun xcv(view: View) {
        val editText1 = findViewById<EditText>(R.id.Text)
        val editText2 = findViewById<EditText>(R.id.Text1)
        val textView3 = findViewById<TextView>(R.id.textView3)

        val firstLeg = editText1.text.toString().toDoubleOrNull()
        val secondLeg = editText2.text.toString().toDoubleOrNull()

        if (firstLeg != null && secondLeg != null) {
            val hypotenuse = hypot(firstLeg, secondLeg)
            val perimeter = firstLeg + secondLeg + hypotenuse
            val area = (firstLeg * secondLeg) / 2

            textView3.text = "Гипотенуза: $hypotenuse\nПериметр: $perimeter\nПлощадь: $area"
        } else {
            textView3.text = "Введите корректные значения"
        }
    }
}