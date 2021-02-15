package com.example.capstonenum_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.farmerL_btn).setOnClickListener{
            startActivity(Intent(applicationContext, Farmerui::class.java))
        }

        findViewById<Button>(R.id.buyerL_btn).setOnClickListener{
            startActivity(Intent(applicationContext, Buyerui::class.java))
        }


    }
}