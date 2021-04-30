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

//        increaseandDecrease()
        anotherIncrease()

    }

    private fun anotherIncrease() {
        val textview = findViewById<TextView>(R.id.number)
        val increaseButton = findViewById<Button>(R.id.increaseButton)
        val decreaseButton = findViewById<Button>(R.id.decreaseButton)

        increaseButton.setOnClickListener(){
            var thisnum = textview.text.toString().toInt()
            var result = thisnum + 1
            textview.text =  result.toString()
        }

        decreaseButton.setOnClickListener(){
            var thisnum = textview.text.toString().toInt()
            if(thisnum > 0 ){
                var result = thisnum - 1
               textview.text = result.toString()
            }
        }


    }


//    fun increaseandDecrease(){
//
//        val number :TextView = findViewById(R.id.number)
//        val increaseButton: Button = findViewById(R.id.increaseButton)
//        val decreaseButton: Button = findViewById(R.id.decreaseButton)
//        var num = 0
//
//        increaseButton.setOnClickListener(){
//            num += 1
//            number.text = num.toString() //display num in text form in the text view of number
//        }
//        decreaseButton.setOnClickListener(){
//
//            num -=1
//            number.text= num.toString()
//        }
//
//
//    }


}
