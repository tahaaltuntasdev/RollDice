package com.tahaaltuntas.mobilders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.tahaaltuntas.mobilders.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        binding.rollButton

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val imageView = findViewById<ImageView>(R.id.img)
        val imageView2 = findViewById<ImageView>(R.id.img2)
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = java.util.Random().nextInt(6) + 1
        var second = java.util.Random().nextInt(6) + 1

        when (randomInt) {
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> imageView.setImageResource(R.drawable.dice_3)
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            6 -> imageView.setImageResource(R.drawable.dice_6)

        }
        resultText.text = randomInt.toString()

        when (second) {
            1 -> imageView2.setImageResource(R.drawable.dice_1)
            2 -> imageView2.setImageResource(R.drawable.dice_2)
            3 -> imageView2.setImageResource(R.drawable.dice_3)
            4 -> imageView2.setImageResource(R.drawable.dice_4)
            5 -> imageView2.setImageResource(R.drawable.dice_5)
            6 -> imageView2.setImageResource(R.drawable.dice_6)
        }

        if(randomInt == 6 || second == 6) {
            startActivity(Intent(this@MainActivity,MainActivity2::class.java))
        }


    }
}

