package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sum = 0
        var current = ""

        ca.setOnClickListener {
            sum = 0
            current = ""
            result.setText(sum.toString())
        }

        plus.setOnClickListener {
            sum += current.toInt()
            result.setText(sum.toString())
            current = ""
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