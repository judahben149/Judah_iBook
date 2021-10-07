package com.example.judah_ibook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.whiteBackground)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
    }
}