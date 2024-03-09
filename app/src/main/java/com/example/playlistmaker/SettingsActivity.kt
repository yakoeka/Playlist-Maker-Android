package com.example.playlistmaker

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonBack = findViewById<ImageButton>(R.id.button_back)

        buttonBack.setOnClickListener {
            finish()
        }
    }
}