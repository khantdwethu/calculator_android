package com.sample.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.sample.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //    to activate static viewById
//    - declare binding : layout file name and add blinding text
//    - on oncreate fun add binding = ActivityMainBinding.inflate(layoutInflater)
//    - setContentView(blinding.root)
    lateinit var binding: ActivityMainBinding
    var resultValue = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root;
        setContentView(view);



        binding.addBtn.setOnClickListener {
            binding.result.setText(
                add(
                    binding.numberOne.text.toString().toInt(),
                    binding.numberTwo.text.toString().toInt()
                ).toString()
            );

        }
        binding.subBtn.setOnClickListener {
            binding.result.setText(
                sub(
                    binding.numberOne.text.toString().toInt(),
                    binding.numberTwo.text.toString().toInt()
                ).toString()
            );
        }
        binding.mulBtn.setOnClickListener {
            binding.result.setText(
                mul(
                    binding.numberOne.text.toString().toInt(),
                    binding.numberTwo.text.toString().toInt()
                ).toString()
            );
        }
        binding.divBtn.setOnClickListener {
            binding.result.setText(
                div(
                    binding.numberOne.text.toString().toInt(),
                    binding.numberTwo.text.toString().toInt()
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