package com.s4id.learningbasics.imccalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.s4id.learningbasics.R

private var isMaleSelected:Boolean = true
private var isFemaleleSelected:Boolean = true

private lateinit var viewMale:CardView
private lateinit var viewFemale:CardView

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