package com.sangjin.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.pow
import kotlin.math.round

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = findViewById<TextView>(R.id.result_tv)
        val resultRange = findViewById<TextView>(R.id.resultRange_tv)

        val height = intent.getIntExtra("height",0)
        val weight = intent.getIntExtra("weight",0)

        val bmi = weight / (height / 100.0).pow(2.0)

        val resultText = when {
            bmi >= 30 -> "비만입니다."
            bmi >= 25 -> "과체중입니다."
            bmi >= 20 -> "정상입니다."
            else -> "저체중입니다."
        }

        result.text = bmi.toString()
        resultRange.text = resultText



    }
}