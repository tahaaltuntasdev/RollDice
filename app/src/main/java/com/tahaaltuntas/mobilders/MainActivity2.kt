package com.tahaaltuntas.mobilders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val winText: TextView = findViewById(R.id.win_text)
        winText.text = "You Win!"

    }
}