package com.example.truco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChampionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_champion)

        val btnNewGame = findViewById<Button>(R.id.newGame)

        btnNewGame.setOnClickListener {
            finish()
        }
    }
}