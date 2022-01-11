package com.example.mycalculater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_add.setOnClickListener(){
            var number1 = (editTextNumber1.text.toString()).toDouble()
            var number2 = (editTextNumber2.text.toString()).toDouble()
            var rs = number1 + number2
            tv_kq.text = rs.toString()
        }
        btn_sub.setOnClickListener(){
            var number1 = (editTextNumber1.text.toString()).toDouble()
            var number2 = (editTextNumber2.text.toString()).toDouble()
            var rs = number1 - number2
            tv_kq.text = rs.toString()
        }
        btn_mul.setOnClickListener(){
            var number1 = (editTextNumber1.text.toString()).toDouble()
            var number2 = (editTextNumber2.text.toString()).toDouble()
            var rs = number1 * number2
            tv_kq.text = rs.toString()
        }
    }
}