package com.example.practise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashactivity)

        supportActionBar?.hide()
       Handler().postDelayed({
           val intent = Intent(this, firstScreen::class.java)
           startActivity(intent)
           finish()
       }, 3000)
        }
    }