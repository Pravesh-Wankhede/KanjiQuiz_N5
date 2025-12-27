package com.example.kanjiquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition = 0

    private var mCorrectAnswers : Int = 0
    private var mUserName : String? = null

    private lateinit var progressBar: ProgressBar
    private lateinit var tvProgress: TextView
    private lateinit var tvQuestion: TextView
    private lateinit var ivImage: ImageView
    private lateinit var btnSubmit: Button

    private lateinit var tvOptionOne: TextView
    private lateinit var tvOptionTwo: TextView
    private lateinit var tvOptionThree: TextView
    private lateinit var tvOptionFour: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        progressBar = findViewById(R.id.ProgessBar)
        tvProgress = findViewById(R.id.tvProgress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.Option_One)
        tvOptionTwo = findViewById(R.id.Option_Two)
        tvOptionThree = findViewById(R.id.Option_Three)
        tvOptionFour = findViewById(R.id.Option_Four)
        btnSubmit = findViewById(R.id.Btn_Submit)

        tvOptionOne.setOnClickListener(this)
        tvOptionTwo.setOnClickListener(this)
        tvOptionThree.setOnClickListener(this)
        tvOptionFour.setOnClickListener(this)
        btnSubmit.setOnClickListener(this)

        mQuestionList = Constants.getQuestions()
        progressBar.max = mQuestionList!!.size

        setQuestion()
    }

    private fun setQuestion() {
        defaultOptionView()
        mSelectedOptionPosition = 0

        val question = mQuestionList!![mCurrentPosition - 1]

        ivImage.setImageResource(question.Image)
        progressBar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition / ${progressBar.max}"
        tvQuestion.text = question.Question

        tvOptionOne.text = question.Optionone
        tvOptionTwo.text = question.Optiontwo
        tvOptionThree.text = question.Optionthree
        tvOptionFour.text = question.OptionFour

        btnSubmit.text =
            if (mCurrentPosition == mQuestionList!!.size) "FINISH" else "SUBMIT"
    }

    private fun defaultOptionView() {
        val options = arrayListOf(
            tvOptionOne, tvOptionTwo, tvOptionThree, tvOptionFour
        )

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_background_bg
            )
        }
    }

    private fun selectOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_background_bg
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.Option_One -> selectOptionView(tvOptionOne, 1)
            R.id.Option_Two -> selectOptionView(tvOptionTwo, 2)
            R.id.Option_Three -> selectOptionView(tvOptionThree, 3)
            R.id.Option_Four -> selectOptionView(tvOptionFour, 4)

            R.id.Btn_Submit -> {

                val question = mQuestionList!![mCurrentPosition - 1]

                // FIRST CLICK → SHOW ANSWER
                if (mSelectedOptionPosition != 0) {

                    if (mSelectedOptionPosition != question.CorrectOption) {
                        answerView(
                            mSelectedOptionPosition,
                            R.drawable.wrong_option_background_bg
                        )
                    } else {
                        mCorrectAnswers++
                    }

                    answerView(
                        question.CorrectOption,
                        R.drawable.correct_option_background_bg
                    )

                    btnSubmit.text = "NEXT"
                    mSelectedOptionPosition = 0
                }
                // SECOND CLICK → NEXT / RESULT
                else {
                    mCurrentPosition++

                    if (mCurrentPosition <= mQuestionList!!.size) {
                        setQuestion()
                        btnSubmit.text = "SUBMIT"
                    } else {
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Constants.USER_NAME, mUserName)
                        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTION, mQuestionList!!.size)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }

         private   fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> tvOptionOne.background =
                ContextCompat.getDrawable(this, drawableView)
            2 -> tvOptionTwo.background =
                ContextCompat.getDrawable(this, drawableView)
            3 -> tvOptionThree.background =
                ContextCompat.getDrawable(this, drawableView)
            4 -> tvOptionFour.background =
                ContextCompat.getDrawable(this, drawableView)
        }
    }
}

