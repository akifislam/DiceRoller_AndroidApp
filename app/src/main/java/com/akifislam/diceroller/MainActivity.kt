// Dice Roller with Image

package com.akifislam.diceroller

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    function to sum
//    fun startSound(){
//        val mp = MediaPlayer.create(this, R.raw.sound)
//        mp.start()
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.roll_button)
        var textView : TextView = findViewById(R.id.textView)
        var imageViewdice : ImageView = findViewById(R.id.image_view_dice)

        var number = 0

        rollButton.text = "ROLL"

        rollButton.setOnClickListener {
            number = (1..6).random()
            imageViewdice.setImageResource(when(number){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
            })
            textView.text = number.toString()



        }



    }
}