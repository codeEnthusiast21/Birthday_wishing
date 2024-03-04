package com.example.practise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondscreen)
        val wish = findViewById<TextView>(R.id.wishText)
        val congrats=findViewById<TextView>(R.id.cage)
        val age=intent.getStringExtra("age")
        val name=intent.getStringExtra("Name")
        val c = age?.toInt()
        val intage= 2024-c!!
        congrats.text= "$intage years old !"
        wish.text= "HAPPY BIRTHDAY \n $name"

    }
}
