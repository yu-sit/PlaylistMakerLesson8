package com.practicum.playlistmaker

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity


class LibraryActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        val back = findViewById<ImageView>(R.id.toolbar_back)
        back.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}