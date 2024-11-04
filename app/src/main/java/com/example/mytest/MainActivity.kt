package com.example.mytest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonWrite = findViewById<Button>(R.id.Button1)
        val buttonFetch = findViewById<Button>(R.id.Button2)
        buttonWrite.setOnClickListener {
            val intentToWriteActivity = Intent(this, WriteActivity::class.java)
            startActivity(intentToWriteActivity)
        }
        buttonFetch.setOnClickListener {
            val intentToFetchActivity = Intent(this, FetchActivity::class.java)
            startActivity(intentToFetchActivity)
        }
    }
}
