package com.example.increase_and_decrease

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        anotherIncrease()
    }

    private fun anotherIncrease() {
        val textview = findViewById<TextView>(R.id.number)
        val increaseButton = findViewById<Button>(R.id.increaseButton)
        val decreaseButton = findViewById<Button>(R.id.decreaseButton)

        increaseButton.setOnClickListener() {
            val thisnum = textview.text.toString().toInt()
            val result = thisnum + 1
            textview.text = result.toString()
        }

        decreaseButton.setOnClickListener() {
            val thisnum = textview.text.toString().toInt()
            if (thisnum > 0) {
                val result = thisnum - 1
                textview.text = result.toString()
            }
        }


    }
}



