package com.sample.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var result: TextView;
    lateinit var numberOne: EditText
    lateinit var numberTwo: EditText
    var resultValue = 0;
    var num1 = 0;
    var num2 = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberOne = findViewById(R.id.numberOne);
        numberTwo = findViewById(R.id.numberTwo);
        result = findViewById(R.id.result);
        val addBtn: Button = findViewById(R.id.addBtn);
        val subBtn: Button = findViewById(R.id.subBtn);
        val mulBtn: Button = findViewById(R.id.mulBtn);
        val divBtn: Button = findViewById(R.id.divBtn);

        addBtn.setOnClickListener {
            result.setText(
                add(
                    numberOne.text.toString().toInt(),
                    numberTwo.text.toString().toInt()
                ).toString()
            );

        }
        subBtn.setOnClickListener {
            result.setText(
                sub(
                    numberOne.text.toString().toInt(),
                    numberTwo.text.toString().toInt()
                ).toString()
            );
        }
        mulBtn.setOnClickListener {
            result.setText(
                mul(
                    numberOne.text.toString().toInt(),
                    numberTwo.text.toString().toInt()
                ).toString()
            );
        }
        divBtn.setOnClickListener {
            result.setText(
                div(
                    numberOne.text.toString().toInt(),
                    numberTwo.text.toString().toInt()
                ).toString()
            );
        }

    }

    private fun add(num1: Int, num2: Int): Int {
        resultValue = num1 + num2;
        return resultValue
    }

    private fun sub(num1: Int, num2: Int): Int {
        resultValue = num1 - num2;
        return resultValue

    }

    private fun mul(num1: Int, num2: Int): Int {
        resultValue = num1 * num2;
        return resultValue
    }


    private fun div(num1: Int, num2: Int): Int {
        resultValue = num1 / num2;
        return resultValue
    }


}