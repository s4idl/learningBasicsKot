package com.s4id.learningbasics.imccalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.s4id.learningbasics.R
import com.s4id.learningbasics.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
    }
}