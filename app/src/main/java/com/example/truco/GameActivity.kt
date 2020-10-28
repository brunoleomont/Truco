package com.example.truco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val btnSomarTime2 = findViewById<Button>(R.id.btnSomarTime2)

        btnSomarTime2.setOnClickListener {
            val intent = Intent(this, ChampionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}