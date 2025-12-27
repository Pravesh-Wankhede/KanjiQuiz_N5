package com.example.kanjiquizapp

import android.util.Log
import kotlin.math.floor

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answer"

    fun getQuestions(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        val Que1 = Question(1,"Which Kanji is this?",R.drawable.ic_kanji1,
            "に","いち","さん","よん",2)
        questionList.add(Que1)
// 一 = いち

        val Que2 = Question(2,"Which Kanji is this?",R.drawable.ic_kanji2,
            "さん","に","よん","いち",2)
        questionList.add(Que2)
// 二 = に

        val Que3 = Question(3,"Which Kanji is this?",R.drawable.ic_kanji3,
            "よん","さん","ご","に",2)
        questionList.add(Que3)
// 三 = さん

        val Que4 = Question(4,"Which Kanji is this?",R.drawable.ic_kanji4,
            "よん","ご","さん","ろく",1)
        questionList.add(Que4)
// 四 = よん

        val Que5 = Question(5,"Which Kanji is this?",R.drawable.ic_kanji5,
            "ろく","なな","ご","はち",3)
        questionList.add(Que5)
// 五 = ご

        val Que6 = Question(6,"Which Kanji is this?",R.drawable.ic_kanji6,
            "ご","ろく","なな","はち",2)
        questionList.add(Que6)
// 六 = ろく

        val Que7 = Question(7,"Which Kanji is this?",R.drawable.ic_kanji7,
            "なな","はち","ろく","きゅう",1)
        questionList.add(Que7)
// 七 = なな

        val Que8 = Question(8,"Which Kanji is this?",R.drawable.ic_kanji8,
            "なな","はち","きゅう","じゅう",2)
        questionList.add(Que8)
// 八 = はち

        val Que9 = Question(9,"Which Kanji is this?",R.drawable.ic_kanji9,
            "きゅう","はち","じゅう","なな",1)
        questionList.add(Que9)
// 九 = きゅう

        val Que10 = Question(10,"Which Kanji is this?",R.drawable.ic_kanji10,
            "じゅう","きゅう","はち","なな",1)
        questionList.add(Que10)
// 十 = じゅう

        val Que11 = Question(11,"Which Kanji is this?",R.drawable.ic_kanji11,
            "ひゃく","せん","じゅう","まん",1)
        questionList.add(Que11)
// 百 = ひゃく

        val Que12 = Question(12,"Which Kanji is this?",R.drawable.ic_kanji12,
            "ひゃく","せん","まん","えん",2)
        questionList.add(Que12)
// 千 = せん

        val Que13 = Question(13,"Which Kanji is this?",R.drawable.ic_kanji13,
            "まん","せん","ひゃく","えん",1)
        questionList.add(Que13)
// 万 = まん

        val Que14 = Question(14,"Which Kanji is this?",R.drawable.ic_kanji14,
            "えん","まん","ひゃく","せん",1)
        questionList.add(Que14)
// 円 = えん

        val Que15 = Question(15,"Which Kanji is this?",R.drawable.ic_kanji15,
            "くち","め","みみ","て",1)
        questionList.add(Que15)
// 口 = くち

        val Que16 = Question(16,"Which Kanji is this?",R.drawable.ic_kanji16,
            "め","くち","みみ","て",1)
        questionList.add(Que16)
// 目 = め

        val Que17 = Question(17,"Which Kanji is this?",R.drawable.ic_kanji17,
            "みみ","め","くち","て",1)
        questionList.add(Que17)
// 耳 = みみ

        val Que18 = Question(18,"Which Kanji is this?",R.drawable.ic_kanji18,
            "て","あし","みみ","め",1)
        questionList.add(Que18)
// 手 = て

        val Que19 = Question(19,"Which Kanji is this?",R.drawable.ic_kanji19,
            "あし","て","くち","め",1)
        questionList.add(Que19)
// 足 = あし

        val Que20 = Question(20,"Which Kanji is this?",R.drawable.ic_kanji20,
            "ひと","おとこ","おんな","こども",1)
        questionList.add(Que20)
// 人 = ひと

        val Que21 = Question(21,"Which Kanji is this?",R.drawable.ic_kanji21,
            "ちち","はは","おとこ","ひと",1)
        questionList.add(Que21)
// 父 = ちち

        val Que22 = Question(22,"Which Kanji is this?",R.drawable.ic_kanji22,
            "はは","ちち","おんな","こ",1)
        questionList.add(Que22)
// 母 = はは

        val Que23 = Question(23,"Which Kanji is this?",R.drawable.ic_kanji23,
            "おとこ","おんな","ひと","こ",1)
        questionList.add(Que23)
// 男 = おとこ

        val Que24 = Question(24,"Which Kanji is this?",R.drawable.ic_kanji24,
            "おんな","おとこ","はは","こ",1)
        questionList.add(Que24)
// 女 = おんな

        val Que25 = Question(25,"Which Kanji is this?",R.drawable.ic_kanji25,
            "こ","とも","ひと","せい",1)
        questionList.add(Que25)
// 子 = こ

        val Que26 = Question(26,"Which Kanji is this?",R.drawable.ic_kanji26,
            "とも","こ","ひと","せい",1)
        questionList.add(Que26)
// 友 = とも

        val Que27 = Question(27,"Which Kanji is this?",R.drawable.ic_kanji27,
            "せい","さき","な","とも",1)
        questionList.add(Que27)
// 生 = せい

        val Que28 = Question(28,"Which Kanji is this?",R.drawable.ic_kanji28,
            "さき","せい","な","かわ",1)
        questionList.add(Que28)
// 先 = さき

        val Que29 = Question(29,"Which Kanji is this?",R.drawable.ic_kanji29,
            "な","さき","せい","かわ",1)
        questionList.add(Que29)
// 名 = な

        val Que30 = Question(30,"Which Kanji is this?",R.drawable.ic_kanji30,
            "かわ","やま","みず","ひと",1)
        questionList.add(Que30)
// 川 = かわ

        val Que41 = Question(41,"Which Kanji is this?",R.drawable.ic_kanji41,
            "き","くう","そら","てん",1)
        questionList.add(Que41)

        val Que42 = Question(42,"Which Kanji is this?",R.drawable.ic_kanji42,
            "あめ","ゆき","くも","そら",4)
        questionList.add(Que42)

        val Que43 = Question(43,"Which Kanji is this?",R.drawable.ic_kanji43,
            "ゆき","あめ","くも","みず",1)
        questionList.add(Que43)

        val Que44 = Question(44,"Which Kanji is this?",R.drawable.ic_kanji44,
            "てん","そら","あめ","ゆき",2)
        questionList.add(Que44)

        val Que45 = Question(45,"Which Kanji is this?",R.drawable.ic_kanji45,
            "はな","くさ","むし","いぬ",3)
        questionList.add(Que45)

        val Que46 = Question(46,"Which Kanji is this?",R.drawable.ic_kanji46,
            "くさ","はな","き","むし",2)
        questionList.add(Que46)

        val Que47 = Question(47,"Which Kanji is this?",R.drawable.ic_kanji47,
            "むし","いぬ","ねこ","とり",1)
        questionList.add(Que47)

        val Que48 = Question(48,"Which Kanji is this?",R.drawable.ic_kanji48,
            "いぬ","ねこ","むし","とり",4)
        questionList.add(Que48)

        val Que49 = Question(49,"Which Kanji is this?",R.drawable.ic_kanji49,
            "おお","ちゅう","しょう","たか",3)
        questionList.add(Que49)

        val Que50 = Question(50,"Which Kanji is this?",R.drawable.ic_kanji50,
            "なか","おお","ちい","そと",1)
        questionList.add(Que50)

        val Que51 = Question(51,"Which Kanji is this?",R.drawable.ic_kanji51,
            "ちい","おお","たか","なが",2)
        questionList.add(Que51)

        val Que52 = Question(52,"Which Kanji is this?",R.drawable.ic_kanji52,
            "うえ","した","ひだり","みぎ",4)
        questionList.add(Que52)

        val Que53 = Question(53,"Which Kanji is this?",R.drawable.ic_kanji53,
            "した","うえ","なか","そと",1)
        questionList.add(Que53)

        val Que54 = Question(54,"Which Kanji is this?",R.drawable.ic_kanji54,
            "ひだり","みぎ","うえ","した",3)
        questionList.add(Que54)

        val Que55 = Question(55,"Which Kanji is this?",R.drawable.ic_kanji55,
            "みぎ","ひだり","そと","なか",2)
        questionList.add(Que55)

        val Que56 = Question(56,"Which Kanji is this?",R.drawable.ic_kanji56,
            "そと","なか","うえ","した",4)
        questionList.add(Que56)

        val Que57 = Question(57,"Which Kanji is this?",R.drawable.ic_kanji57,
            "うち","そと","なか","あいだ",1)
        questionList.add(Que57)

        val Que58 = Question(58,"Which Kanji is this?",R.drawable.ic_kanji58,
            "あいだ","なか","そと","うち",4)
        questionList.add(Que58)

        val Que59 = Question(59,"Which Kanji is this?",R.drawable.ic_kanji59,
            "ひがし","にし","みなみ","きた",2)
        questionList.add(Que59)

        val Que60 = Question(60,"Which Kanji is this?",R.drawable.ic_kanji60,
            "にし","ひがし","みなみ","きた",3)
        questionList.add(Que60)

        val Que61 = Question(61,"Which Kanji is this?",R.drawable.ic_kanji61,
            "みなみ","きた","ひがし","にし",1)
        questionList.add(Que61)
// 南 = みなみ → 1

        val Que62 = Question(62,"Which Kanji is this?",R.drawable.ic_kanji62,
            "きた","みなみ","ひがし","にし",2)
        questionList.add(Que62)
// 北 = きた → 1 ❌, correct placed at 2

        val Que63 = Question(63,"Which Kanji is this?",R.drawable.ic_kanji63,
            "なが","たか","あたら","ふる",2)
        questionList.add(Que63)
// 長 = なが → 1 ❌, correct at 2

        val Que64 = Question(64,"Which Kanji is this?",R.drawable.ic_kanji64,
            "たか","なが","あたら","ふる",1)
        questionList.add(Que64)
// 高 = たか → 1

        val Que65 = Question(65,"Which Kanji is this?",R.drawable.ic_kanji65,
            "あたら","ふる","たか","なが",1)
        questionList.add(Que65)
// 新 = あたら → 1

        val Que66 = Question(66,"Which Kanji is this?",R.drawable.ic_kanji66,
            "ふる","あたら","たか","なが",1)
        questionList.add(Que66)
// 古 = ふる → 1

        val Que67 = Question(67,"Which Kanji is this?",R.drawable.ic_kanji67,
            "しろ","くろ","あか","あお",3)
        questionList.add(Que67)
// 白 = しろ → 1 ❌, correct at 3

        val Que68 = Question(68,"Which Kanji is this?",R.drawable.ic_kanji68,
            "くろ","しろ","あか","あお",1)
        questionList.add(Que68)
// 黒 = くろ → 1

        val Que69 = Question(69,"Which Kanji is this?",R.drawable.ic_kanji69,
            "あか","あお","しろ","くろ",1)
        questionList.add(Que69)
// 赤 = あか → 1

        val Que70 = Question(70,"Which Kanji is this?",R.drawable.ic_kanji70,
            "あお","あか","しろ","くろ",2)
        questionList.add(Que70)
// 青 = あお → 1 ❌, correct at 2

        val Que71 = Question(71,"Which Kanji is this?",R.drawable.ic_kanji71,
            "ほん","もと","ぶん","じ",2)
        questionList.add(Que71)
// 本 = ほん (option 2)

        val Que72 = Question(72,"Which Kanji is this?",R.drawable.ic_kanji72,
            "ぶん","じ","ほん","がく",1)
        questionList.add(Que72)
// 文 = ぶん (option 1)

        val Que73 = Question(73,"Which Kanji is this?",R.drawable.ic_kanji73,
            "ぶん","がく","じ","こう",3)
        questionList.add(Que73)
// 字 = じ (option 3)

        val Que74 = Question(74,"Which Kanji is this?",R.drawable.ic_kanji74,
            "こう","み","がく","き",3)
        questionList.add(Que74)
// 学 = がく (option 3)

        val Que75 = Question(75,"Which Kanji is this?",R.drawable.ic_kanji75,
            "がく","こう","み","き",2)
        questionList.add(Que75)
// 校 = こう (option 2)

        val Que76 = Question(76,"Which Kanji is this?",R.drawable.ic_kanji76,
            "き","み","きく","いう",2)
        questionList.add(Que76)
// 見 = み (option 2)

        val Que77 = Question(77,"Which Kanji is this?",R.drawable.ic_kanji77,
            "み","いう","きく","はなす",3)
        questionList.add(Que77)
// 聞 = きく (option 3)

        val Que78 = Question(78,"Which Kanji is this?",R.drawable.ic_kanji78,
            "はなす","いう","きく","よむ",2)
        questionList.add(Que78)
// 言 = いう (option 2)

        val Que79 = Question(79,"Which Kanji is this?",R.drawable.ic_kanji79,
            "いう","きく","よむ","はなす",4)
        questionList.add(Que79)
// 話 = はなす (option 4)

        val Que80 = Question(80,"Which Kanji is this?",R.drawable.ic_kanji80,
            "かく","のむ","よむ","たべる",3)
        questionList.add(Que80)
// 読 = よむ (option 3)
        val Que81 = Question(81,"Which Kanji is this?",R.drawable.ic_kanji81,
            "かく","よむ","たべる","のむ",1)
        questionList.add(Que81)
// 書 = かく (1)

        val Que82 = Question(82,"Which Kanji is this?",R.drawable.ic_kanji82,
            "のむ","たべる","かう","いく",2)
        questionList.add(Que82)
// 食 = たべる (2)

        val Que83 = Question(83,"Which Kanji is this?",R.drawable.ic_kanji83,
            "たべる","のむ","かう","いく",2)
        questionList.add(Que83)
// 飲 = のむ (2)

        val Que84 = Question(84,"Which Kanji is this?",R.drawable.ic_kanji84,
            "いく","たべる","のむ","かう",4)
        questionList.add(Que84)
// 買 = かう (4)

        val Que85 = Question(85,"Which Kanji is this?",R.drawable.ic_kanji85,
            "くる","いく","でる","はいる",2)
        questionList.add(Que85)
// 行 = いく (2)

        val Que86 = Question(86,"Which Kanji is this?",R.drawable.ic_kanji86,
            "いく","くる","でる","はいる",2)
        questionList.add(Que86)
// 来 = くる (2)

        val Que87 = Question(87,"Which Kanji is this?",R.drawable.ic_kanji87,
            "はいる","でる","いく","くる",2)
        questionList.add(Que87)
// 出 = でる (2)

        val Que88 = Question(88,"Which Kanji is this?",R.drawable.ic_kanji88,
            "でる","はいる","いく","くる",2)
        questionList.add(Que88)
// 入 = はいる (2)

        val Que89 = Question(89,"Which Kanji is this?",R.drawable.ic_kanji89,
            "あう","やすむ","でん","くるま",2)
        questionList.add(Que89)
// 休 = やすむ (2)

        val Que90 = Question(90,"Which Kanji is this?",R.drawable.ic_kanji90,
            "やすむ","あう","でん","くるま",2)
        questionList.add(Que90)
// 会 = あう (2)

        val Que91 = Question(91,"Which Kanji is this?",R.drawable.ic_kanji91,
            "でん","くるま","えき","しゃ",3)
        questionList.add(Que91)
// 電 = でん (3)

        val Que92 = Question(92,"Which Kanji is this?",R.drawable.ic_kanji92,
            "しゃ","でん","くるま","えき",3)
        questionList.add(Que92)
// 車 = くるま (3)

        val Que93 = Question(93,"Which Kanji is this?",R.drawable.ic_kanji93,
            "えき","しゃ","でん","くるま",1)
        questionList.add(Que93)
// 駅 = えき (1)

        val Que94 = Question(94,"Which Kanji is this?",R.drawable.ic_kanji94,
            "くに","しゃ","まい","なに",2)
        questionList.add(Que94)
// 社 = しゃ (2)

        val Que95 = Question(95,"Which Kanji is this?",R.drawable.ic_kanji95,
            "まい","なに","くに","とき",3)
        questionList.add(Que95)
// 国 = くに (3)

        val Que96 = Question(96,"Which Kanji is this?",R.drawable.ic_kanji96,
            "なに","まい","とき","ぶん",2)
        questionList.add(Que96)
// 毎 = まい (2)

        val Que97 = Question(97,"Which Kanji is this?",R.drawable.ic_kanji97,
            "とき","なに","まい","ぶん",2)
        questionList.add(Que97)
// 何 = なに (2)

        val Que98 = Question(98,"Which Kanji is this?",R.drawable.ic_kanji98,
            "ぶん","とき","ご","はん",2)
        questionList.add(Que98)
// 時 = とき (2)


        val Que99 = Question(99,"Which Kanji is this?",R.drawable.ic_kanji99,
            "ぶん","とき","ご","はん",1)
        questionList.add(Que99)
// 分 = ぶん (1)

        val Que100 = Question(100,"Which Kanji is this?",R.drawable.ic_kanji100,
            "ご","いま","しゅう","ねん",1)
        questionList.add(Que100)
// 午 = ご (1)

        val Que101 = Question(101,"Which Kanji is this?",R.drawable.ic_kanji101,
            "しゅう","いま","ねん","はん",2)
        questionList.add(Que101)
// 今 = いま (2)

        val Que102 = Question(102,"Which Kanji is this?",R.drawable.ic_kanji102,
            "ねん","しゅう","いま","はん",2)
        questionList.add(Que102)
// 週 = しゅう (2)

        val Que103 = Question(103,"Which Kanji is this?",R.drawable.ic_kanji103,
            "とし","ねん","はん","いま",2)
        questionList.add(Que103)
// 年 = ねん (2)

        val Que104 = Question(104,"Which Kanji is this?",R.drawable.ic_kanji104,
            "ぶん","はん","ねん","いま",2)
        questionList.add(Que104)
// 半 = はん (2)










        shuffleArray(questionList)
        return questionList
    }

    private fun shuffleArray(arr: ArrayList<Question>) {
        var i = arr.size
        var j: Int
        var temp: Question

        while (--i > 0) {
            j = floor(Math.random() * (i + 1)).toInt()
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }

        for (q in arr) {
            Log.i("Question", "ID = ${q.id}")
        }
    }
}
