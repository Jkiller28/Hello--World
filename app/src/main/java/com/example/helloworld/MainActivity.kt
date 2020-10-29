package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast = findViewById<View>(R. id.btnToast) as Button

        btnToast.setOnClickListener {
            Toast.makeText(applicationContext, "Hello World! via Kotlin", Toast.LENGTH_LONG).show()
        }

    }
}