package com.example.sample4_10

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
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

        var web1: WebView = findViewById(R.id.web)
        web1.webViewClient = WebViewClient()
        web1.loadUrl("https://www.google.co.kr")
        web1.settings.javaScriptEnabled = true

        var btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener {
            web1.loadUrl("https://topis.seoul.go.kr")
        }

        var btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            web1.loadUrl("https://m.work.go.kr")
        }

        var btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            web1.loadUrl("https://weather.go.kr/m/index.do")
        }

        var btn4 = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener {
            web1.loadUrl("https://google.co.kr/maps")
        }

        var btn5 = findViewById<Button>(R.id.button5)
        btn5.setOnClickListener {
            web1.goBack()
        }
        var btn6 = findViewById<Button>(R.id.button6)
        btn6.setOnClickListener {
            web1.reload()
        }
        var btn7 = findViewById<Button>(R.id.button7)
        btn7.setOnClickListener {
            web1.goForward()
        }
    }
}