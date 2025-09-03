package com.example.sample4_12

import android.media.SoundPool
import android.os.Bundle
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
        }]

        val mPlay = SoundPool.Builder()
            .setMaxStreams(4)
            .build()
        val sd01 = mPlay.load(this,R.raw.sound11,1)
        val sd02 = mPlay.load(this,R.raw.sound22,1)
        val sd03 = mPlay.load(this,R.raw.sound33,1)
        val sd04 = mPlay.load(this,R.raw.sound44,1)
        val baseBtn = findViewById<Button>(R.id.base)
        val snareBtn = findViewById<Button>(R.id.snare)
        val tomtomBtn = findViewById<Button>(R.id.tomtom)
        val cymbalBtn = findViewById<Button>(R.id.cymbal)

        baseBtn.setOnClickListener {
            mPlay.play(sd01 //출력할 음원 id
                ,1.0f // 왼쪽 보륨 1.0f가 최대
                , 1.0f // 오른쪽 볼륨 1.0f 가 최대
                ,1 //우선순위
                ,0 // 반복회수
                ,1.0f // 재생속도 1배속
            )
        }
        snareBtn.setOnClickListener {
            mPlay.play(sd02 //출력할 음원 id
                ,1.0f // 왼쪽 보륨 1.0f가 최대
                , 1.0f // 오른쪽 볼륨 1.0f 가 최대
                ,1 //우선순위
                ,0 // 반복회수
                ,1.0f // 재생속도 1배속
            )
        }
        tomtomBtn.setOnClickListener {
            mPlay.play(sd03 //출력할 음원 id
                ,1.0f // 왼쪽 보륨 1.0f가 최대
                , 1.0f // 오른쪽 볼륨 1.0f 가 최대
                ,1 //우선순위
                ,0 // 반복회수
                ,1.0f // 재생속도 1배속
            )
        }
        cymbalBtn.setOnClickListener {
            mPlay.play(sd04 //출력할 음원 id
                ,1.0f // 왼쪽 보륨 1.0f가 최대
                , 1.0f // 오른쪽 볼륨 1.0f 가 최대
                ,1 //우선순위
                ,0 // 반복회수
                ,1.0f // 재생속도 1배속
            )
        }

    }
}