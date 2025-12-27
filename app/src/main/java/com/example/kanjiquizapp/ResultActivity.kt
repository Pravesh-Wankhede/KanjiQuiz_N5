package com.example.kanjiquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val tvname : TextView =findViewById(R.id.tv_name)
        val resultScreen : TextView = findViewById(R.id.tv_result_screen)
        val congrats : TextView = findViewById(R.id.congrats)
        val score : TextView = findViewById(R.id.player_score)
        val winCup : ImageView = findViewById(R.id.iv_trophy)
        val btnFinish : Button = findViewById(R.id.btn_done)


        tvname.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        score.text = "Your Score Is $correctAnswers /$totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java  ))
        }
    }
}