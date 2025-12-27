package com.example.kanjiquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnStart : Button = findViewById(R.id.btn_Start)
        val enterName : EditText = findViewById(R.id.enter_name)

        btnStart.setOnClickListener {

            if (enterName.text.isEmpty()){
                Toast.makeText(this,
                    "Please Enter Your Name",
                    Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, enterName.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}
