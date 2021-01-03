package com.enchufaocoding.guessmynumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number : Int = 5
    lateinit var questionTextView : TextView
    lateinit var resultTexView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.question_text_view)
        resultTexView = findViewById(R.id.result_text_view)
        questionTextView.text = String.format(resources.getString(R.string.str_question), number)

    }

    fun clickDownwardArrow(view : View) {
        clickDownwardArrow ()
    }

    fun clickSuccess(view : View){
        clickSuccessMyButton()
    }

    fun clickUpwardArrow(view : View){
        clickUpwardArrow()
    }

    fun clickResetButton(view : View){
        clickResetMyUI()
    }

    fun printTheQuestion(){
        questionTextView.text = String.format(resources.getString(R.string.str_question), number)
    }

    fun clickDownwardArrow(){
        when (number) {
            5 -> {
                number = 3
                printTheQuestion()
            }
            3 -> {
                number = 2
                printTheQuestion()
            }
            2 -> {
                number = 1
                printTheQuestion()
            }
            8 -> {
                number = 7
                printTheQuestion()
            }
            7 -> {
                number = 6
                printTheQuestion()
            }
        }
    }

    fun clickUpwardArrow() {
        when (number) {
            3 -> {
                number = 4
                printTheQuestion()
            }
            5 -> {
                number = 8
                printTheQuestion()
            }
            8 -> {
                number = 9
                printTheQuestion()
            }
            9 -> {
                number = 10
                printTheQuestion()
            }
        }
    }

    fun clickResetMyUI() {
        questionTextView.visibility = View.VISIBLE
        resultTexView.visibility = View.INVISIBLE
        number = 5
        printTheQuestion()
    }

    fun clickSuccessMyButton() {
        questionTextView.visibility = View.INVISIBLE
        resultTexView.visibility = View.VISIBLE
        resultTexView.text = String.format(resources.getString(R.string.str_success), number)
    }

}