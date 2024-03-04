package com.example.practise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class firstScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstscreen)
        val a=findViewById<EditText>(R.id.edt1)
        val b=findViewById<EditText>(R.id.edt2)
        val c=findViewById<Button>(R.id.btn1)
        c.setOnClickListener{
            val name= a.text.toString()
            val age= b.text.toString()
            val intent= Intent(this,secondScreen::class.java)

            intent.putExtra("Name",name)
            intent.putExtra("age",age)
            startActivity(intent)

        }
    }
}
