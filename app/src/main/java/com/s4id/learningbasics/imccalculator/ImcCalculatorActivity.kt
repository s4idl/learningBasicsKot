package com.s4id.learningbasics.imccalculator

import android.icu.text.DecimalFormat
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.compose.ui.text.font.FontWeight
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.s4id.learningbasics.R

private var isMaleSelected:Boolean = true
private var isFemaleleSelected:Boolean = true
private var currentWeight:Int = 70

private lateinit var viewMale:CardView
private lateinit var viewFemale:CardView
private lateinit var tvHeight:TextView
private lateinit var rsHeight:RangeSlider
private lateinit var substractWeight:FloatingActionButton
private lateinit var plusWeight: FloatingActionButton
private lateinit var tvWeight:TextView

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
        tvHeight=findViewById(R.id.viewHeight)
        rsHeight=findViewById(R.id.rsHeight)
        substractWeight=findViewById(R.id.substractWeight)
        plusWeight=findViewById(R.id.plusWeight)
        tvWeight=findViewById(R.id.tvWeight)
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
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text = "$result cm"
        }
        plusWeight.setOnClickListener{
            currentWeight += 1
            setWeight()
        }
        substractWeight.setOnClickListener{}
        currentWeight -= 1
        setWeight()
    }

    private fun setWeight(){
        tvWeight.text = currentWeight.toString()
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
        setWeight()
    }


}