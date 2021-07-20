package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var net = 0
        var current = ""
        var method = "plus"


        fun getNumKor(value: String): String {
            val kor1 = listOf("", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구")
            val kor2 = listOf("", "십", "백", "천")
            val kor3 = listOf("", "만", "억", "조", "경")

            val strVal = value.toString()
            val strLen = strVal.length
            var strRet = ""
            var nowInt = 0

            strVal.forEachIndexed { index, c ->
                var nowInt = Character.getNumericValue(value.get(strLen - index - 1))

                var now = ""
                if (nowInt > 0) {
                    now = now + kor1[nowInt] + kor2[index % 4]
                }

                if (index % 4 == 0) {
                    now = now + kor3[index / 4]
                }
                strRet = now + strRet
            }

            return strRet

        }

        result.setOnTouchListener { _: View, event: MotionEvent ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    result.setText(getNumKor(result.text.toString()))
                }
            }

            when (event.action) {
                MotionEvent.ACTION_UP -> {
                    result.setText(net.toString())
                }
            }

            true
        }

        fun calc(it: View) {
            if (current != "") {
                if (method == "plus") {
                    net += current.toInt()
                } else if (method == "minus") {
                    net -= current.toInt()
                } else if (method == "multiply") {
                    net *= current.toInt()
                } else if (method == "divide") {
                    net /= current.toInt()
                }
            }
            result.setText(net.toString())
            current = ""
            var fullName = getResources().getResourceName(it.getId())
            var name = fullName.substring(fullName.lastIndexOf("/") + 1)
            method = name
        }

        ca.setOnClickListener {
            net = 0
            current = ""
            method = "plus"
            result.setText(net.toString())
        }

        plus.setOnClickListener {
            calc(it)
        }
        minus.setOnClickListener {
            calc(it)
        }
        multiply.setOnClickListener {
            calc(it)
        }

        divide.setOnClickListener {
            calc(it)
        }

        one.setOnClickListener {
            current += "1"
            result.setText(current)
        }

        two.setOnClickListener {
            current += "2"
            result.setText(current)
        }
        three.setOnClickListener {
            current += "3"
            result.setText(current)
        }
        four.setOnClickListener {
            current += "4"
            result.setText(current)
        }
        five.setOnClickListener {
            current += "5"
            result.setText(current)
        }
        six.setOnClickListener {
            current += "6"
            result.setText(current)
        }
        seven.setOnClickListener {
            current += "7"
            result.setText(current)
        }
        eight.setOnClickListener {
            current += "8"
            result.setText(current)
        }
        nine.setOnClickListener {
            current += "9"
            result.setText(current)
        }
        zero.setOnClickListener {
            current += "0"
            result.setText(current)
        }


    }
}