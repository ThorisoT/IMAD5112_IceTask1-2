package com.example.icetask1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeEditText = findViewById<EditText>(R.id.timeEditText)
        val submitButton = findViewById<Button>(R.id.sumbitButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val resetButton = findViewById<Button>(R.id.resetButton)

        submitButton.setOnClickListener {

            val timeInput = timeEditText.text.toString()

            val message = when (timeInput) {

                "Morning" -> "Review your notes from yesterday's lecture for 15 minutes."
                "Mid-Morning" -> "Tackle your most difficult assignment or task while your focus is high."
                "Afternoon" -> "Take a 10-minute break, stretch, and drink some water before continuing."
                "Afternoon Snack Time" -> "Do a quick 5-minute revision quiz on today's topic."
                "Evening" -> "Organise your notes and create a to-do list for tomorrow."
                "Night" -> "Wind down by reading over your goals and preparing your bag for tomorrow."
                else -> "Invalid input. Please enter: Morning, Mid-Morning, Afternoon, Afternoon Snack Time, Evening or Night"
            }

            resultTextView.text = message
        }

        resetButton.setOnClickListener {
            timeEditText.text.clear()
            resultTextView.text = "Your message will appear here."
        }
    }
}


