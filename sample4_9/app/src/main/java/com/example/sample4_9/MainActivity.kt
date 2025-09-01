package com.example.sample4_9

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1 = findViewById<Button>(R.id.button1)

        btn1.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.act1)
            btn1.startAnimation(anim)
        }

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this, R.anim.act2)
            btn2.startAnimation(anim)
        }
    }
}