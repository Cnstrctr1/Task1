package com.example.myapplication

import activities.ActivityA
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
    }
}

