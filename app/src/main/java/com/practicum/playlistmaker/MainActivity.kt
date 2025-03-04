package com.practicum.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val search = findViewById<Button>(R.id.search)
        search.setOnClickListener(this@MainActivity)
        val media = findViewById<Button>(R.id.library)
        media.setOnClickListener(this@MainActivity)
        val settings = findViewById<Button>(R.id.settings)
        settings.setOnClickListener(this@MainActivity)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.search -> {
                val displayIntent = Intent(this, SearchActivity::class.java)
                startActivity(displayIntent)
            }
            R.id.library -> {

                val displayIntent = Intent(this, LibraryActivity::class.java)
                startActivity(displayIntent)
            }
            R.id.settings -> {

                val displayIntent = Intent(this, SettingsActivity::class.java)
                startActivity(displayIntent)
            }
        }
    }
}













