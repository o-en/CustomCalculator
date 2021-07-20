package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var net = 0.0
        var current = ""
        var method = "plus"

        ca.setOnClickListener {
            net = 0.0
            current = ""
            method = "plus"
            result.setText("0")
        }

        fun calc(it: View) {
            if (current != "") {
                if (method == "plus") {
                    net += current.toDouble()
                } else if (method == "minus") {
                    net -= current.toDouble()
                } else if (method == "multiply") {
                    net *= current.toDouble()
                } else if (method == "divide") {
                    net /= current.toDouble()
                }
            }
            result.setText(net.toString())
            current = ""
            var fullName = getResources().getResourceName(it.getId())
            var name = fullName.substring(fullName.lastIndexOf("/") + 1)
            method = name
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