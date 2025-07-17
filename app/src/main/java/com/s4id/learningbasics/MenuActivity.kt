package com.s4id.learningbasics

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.text.BasicTextField
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.s4id.learningbasics.firstapp.FirstAppActivity
import com.s4id.learningbasics.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp  = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp  = findViewById<Button>(R.id.btnIMCApp)
        btnSaludApp.setOnClickListener{ navigateToSaludApp() }
        btnIMCApp.setOnClickListener{ navigateToImcApp() }
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}