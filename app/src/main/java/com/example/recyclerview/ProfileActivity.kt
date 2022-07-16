package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    private var textViewProfile:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        connectViews()
        val name = intent.getStringExtra("NAME")
        textViewProfile?.setText(name)

    }

    private fun connectViews() {
        textViewProfile = findViewById(R.id.tvProfilePage)
    }
}