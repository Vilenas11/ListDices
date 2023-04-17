package com.example.dicewithlisthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    lateinit var textViewElement : TextView
    lateinit var textViewElementSum : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewElement = findViewById(R.id.textViewElement)
        textViewElementSum = findViewById(R.id.textView2)

        var mutableEmptyList = List(6){Random.nextInt(1..6)}
        var sumOfDices : Int = 0

        for(i in 0..5){
            sumOfDices += mutableEmptyList[i]

        }

        textViewElement.text = "Numbers rolled by the 6 dices are ${mutableEmptyList.get(0)}, ${mutableEmptyList.get(1)}," +
                " ${mutableEmptyList.get(2)}, ${mutableEmptyList.get(3)}, ${mutableEmptyList.get(4)}, ${mutableEmptyList.get(5)}"
        textViewElementSum.text = "The sum for the dices is $sumOfDices"


    }
}