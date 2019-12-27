package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        rollButton.setOnClickListener {
            rollDice(resultTextView)
        }
    }

    private fun rollDice(resultTextView: TextView) {
        resultTextView.text = Random.nextInt(1, 7).toString()
    }
}