package com.sangjin.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height = findViewById<EditText>(R.id.hight_et).text
        val weight = findViewById<EditText>(R.id.weight_et).text
        val checkBtn = findViewById<Button>(R.id.check_btn)

        checkBtn.setOnClickListener {
            if(height.isEmpty() || weight.isEmpty()) {
                Toast.makeText(this, "키와 몸무게를 입력하세요.", Toast.LENGTH_SHORT).show()
            }
            else {
                val heightInt = height.toString().toInt()
                val weightInt = weight.toString().toInt()


                val intent = Intent(this, result::class.java)
                intent.putExtra("height", heightInt)
                intent.putExtra("weight", weightInt)
                startActivity(intent)
            }
        }




    }
}