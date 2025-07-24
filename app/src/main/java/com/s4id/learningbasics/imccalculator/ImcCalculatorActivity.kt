package com.s4id.learningbasics.imccalculator

import android.icu.text.DecimalFormat
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider
import com.s4id.learningbasics.R

private var isMaleSelected:Boolean = true
private var isFemaleleSelected:Boolean = true

private lateinit var viewMale:CardView
private lateinit var viewFemale:CardView
private lateinit var viewHeight:TextView
private lateinit var rsHeight:RangeSlider

class ImcCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
        initListeners()
        initUi()
    }

    private fun initComponents(){
        viewMale=findViewById(R.id.viewMale)
        viewFemale=findViewById(R.id.viewFemale)
        viewHeight=findViewById(R.id.viewHeight)
        rsHeight=findViewById(R.id.rsHeight)
    }

    private fun initListeners(){
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        rsHeight.addOnChangeListener{ _, value, _ ->
            val df = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                DecimalFormat("#.##")
            } else {
                TODO("VERSION.SDK_INT < N")
            }
            val result = df.format(value)
            viewHeight.text = "$result cm"
        }
    }

    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleleSelected = !isFemaleleSelected
    }

    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent:Boolean): Int{


        val colorReference = if(isSelectedComponent){
            R.color.backgorund_component_selected
        }else{
            R.color.backgorund_component_selected
        }

       return ContextCompat.getColor(this, colorReference)
    }

    private fun initUi(){
        setGenderColor()
    }


}