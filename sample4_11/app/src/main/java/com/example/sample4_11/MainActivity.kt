package com.example.sample4_11

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //이벤트 처리

//        val btn1 = findViewById<Button>(R.id.button1)
//        btn1.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-1234"))
//            startActivity(intent)
//        }
//        val btn2 = findViewById<Button>(R.id.button2)
//        btn2.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-1234"))
//            startActivity(intent)
//        }
//        val btn3 = findViewById<Button>(R.id.button3)
//        btn3.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-1234"))
//            startActivity(intent)
//        }
//        val btn4 = findViewById<Button>(R.id.button4)
//        btn4.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-1234"))
//            startActivity(intent)
//        }
//        val btn5 = findViewById<Button>(R.id.button5)
//        btn5.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-1234"))
//            startActivity(intent)
//        }
//        val btn6 = findViewById<Button>(R.id.button6)
//        btn6.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-1234"))
//            startActivity(intent)
//        }

        //ListView
        val listView = findViewById<ListView>(R.id.myListView)

        //ListView에 넣을 데이터 만들기
        val items = ArrayList<String>()
        items.add("첫번째 아이템")
        items.add("두번째 아이템")
        items.add("세번째 아이템")


        // ListView에 데이터를 넣을때는 Adapter를 사용합니다.
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, view, position, id ->
            val selectedItem = items[position]
            Toast.makeText(
                this,
                "클릭한 항목 : $selectedItem",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}