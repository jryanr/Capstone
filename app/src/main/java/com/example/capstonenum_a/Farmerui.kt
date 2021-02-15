package com.example.capstonenum_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Farmerui : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farmerui)

        findViewById<Button>(R.id.show_btn).setOnClickListener{
            startActivity(Intent(applicationContext, Geolocation::class.java))
        }
    }
}