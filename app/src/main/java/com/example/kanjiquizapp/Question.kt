package com.example.kanjiquizapp

data class Question(
    val id: Int,
    val Question : String,
    val Image : Int,

    val Optionone : String,
    val Optiontwo : String,
    val Optionthree : String,
    val OptionFour : String,

    val CorrectOption : Int,

)
