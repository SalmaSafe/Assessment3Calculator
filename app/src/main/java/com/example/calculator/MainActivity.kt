package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etNum1:TextInputEditText
    lateinit var etNum2:TextInputEditText

    lateinit var tilNum1:TextInputLayout
    lateinit var tilNum2:TextInputLayout

    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button

    lateinit var btnModulus:Button
    lateinit var btnDivision:Button

    lateinit var tvAns:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1= findViewById(R.id.etNum1)
        etNum2= findViewById(R.id.etNum2)

        tilNum1= findViewById(R.id.tilNum1)
        tilNum2= findViewById(R.id.tilNum2)

        btnAdd= findViewById(R.id.btnAdd)
        btnSubtract= findViewById(R.id.btnSubtract)
        btnDivision= findViewById(R.id.btnDivision)
        btnModulus= findViewById(R.id.btnModulus)

        tvAns= findViewById(R.id.tvAns)

        btnAdd.setOnClickListener {
            tvAns.text = ""
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()

            if (num1.isBlank()) {
                etNum1.error=""
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                etNum2.error="required"
                return@setOnClickListener
            }
            add (num1.toInt() , num2.toInt())
         }
        btnSubtract.setOnClickListener {
            tvAns.text = ""
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()

            if (num1.isBlank()) {
                etNum1.error=""
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                etNum2.error="required"
                return@setOnClickListener
            }
            subtract(num1.toInt() , num2.toInt())
        }
        btnModulus.setOnClickListener {
            tvAns.text = ""
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()

            if (num1.isBlank()) {
                etNum1.error=""
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                etNum2.error="required"
                return@setOnClickListener
            }
            modulus(num1.toInt() , num2.toInt())
        }
        btnDivision.setOnClickListener {
            tvAns.text = ""
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()

            if (num1.isBlank()) {
                etNum1.error=""
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                etNum2.error="required"
                return@setOnClickListener
            }
            division(num1.toInt() , num2.toInt())
        }


    }
    private fun add(num1: Int, num2: Int) {
        var addition = num1 + num2
        tvAns.text = addition.toString()
    }
    private fun subtract(num1: Int, num2: Int) {
        var minus = num1 - num2
        tvAns.text = minus.toString()
    }
    private fun modulus(num1: Int, num2: Int) {
        var remainder = num1 % num2
        tvAns.text = remainder.toString()
    }
    private fun division(num1: Int, num2: Int) {
        var divide = num1 / num2
        tvAns.text = divide.toString()
    }
}