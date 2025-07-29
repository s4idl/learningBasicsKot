package com.s4id.learningbasics.imccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.s4id.learningbasics.R
import com.s4id.learningbasics.R.*
import com.s4id.learningbasics.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnReCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_result2)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {
        btnReCalculate.setOnClickListener { onBackPressed() }
    }

    private fun initUI(result: Double){
        tvIMC.text =result.toString()
        when(result){
            in 0.0..18.50 -> { //BAJO
                tvResult.text = getString(R.string.title_bajo_peso)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tvDescription.text = getString(R.string.description_bajo_peso)
            }
            in 18.51..24.99 -> { //NORMAL
                tvResult.text = getString(R.string.title_peso_normal)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tvDescription.text = getString(R.string.description_peso_normal)
            }
            in 25.00..29.99 -> { //SPBRE
                tvResult.text = getString(R.string.title_obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvDescription.text = getString(R.string.description_obesidad)
            }
            in 30.00..99.00 -> { //MEGA
                tvResult.text = getString(R.string.title_obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_sobrepeso))
                tvDescription.text = getString(R.string.description_obesidad)
            }else -> {
            tvIMC.text = getString(R.string.error)
            tvResult.text = getString(R.string.error)
            tvDescription.text = getString(R.string.error)
            }
        }
    }

    private fun initComponents(){
        tvIMC = findViewById(id.tvIMC)
        tvResult = findViewById(id.tvResult)
        tvDescription = findViewById(id.tvDescription)
        btnReCalculate = findViewById(id.btnReCalculate)
    }
}