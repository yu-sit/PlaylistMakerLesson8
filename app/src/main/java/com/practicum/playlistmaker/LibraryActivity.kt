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

        val imageBack = findViewById<ImageView>(R.id.backToMainActivity)
        imageBack.setOnClickListener{finish()}

    }
}