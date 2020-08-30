package com.example.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(){
            Toast.makeText(this,"CLicked Button 1", Toast.LENGTH_SHORT).show();
        }

        button2.setOnClickListener(){
            startActivity(Intent(this@MainActivity, NextActivity::class.java))
        }
    }
}