package com.example.lab2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField = findViewById<EditText>(R.id.inputField)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        checkButton.setOnClickListener {
            val input = inputField.text.toString()

            val n = input.toInt()

            if (n <= 0) {
                resultText.text = "Введите положительное число"
                return@setOnClickListener
            }

            var sum = 0.0
            var factorial = 1.0

            for (i in 1..n) {
                factorial *= i //
                sum += 1.0 / factorial //
            }
            resultText.text = "$sum"
        }
    }
}