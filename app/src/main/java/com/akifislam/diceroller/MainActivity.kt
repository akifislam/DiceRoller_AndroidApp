package com.akifislam.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.roll_button)
        var textView : TextView = findViewById(R.id.textView)

        var number = 0

        rollButton.text = "ROLL"

        rollButton.setOnClickListener {
            number = (1..6).random()
            textView.text = number.toString()
        }



    }
}