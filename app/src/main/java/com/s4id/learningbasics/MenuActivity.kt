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
import com.s4id.learningbasics.superheroapp.SuperHeroListActivity
import com.s4id.learningbasics.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp  = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp  = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperHero = findViewById<Button>(R.id.btnSuperHero)

        btnSaludApp.setOnClickListener{ navigateToSaludApp() }
        btnIMCApp.setOnClickListener{ navigateToImcApp() }
        btnTODO.setOnClickListener{ navigateToTodoApp() }
        btnSuperHero.setOnClickListener{ navigateToSuperHeroApp() }
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToTodoApp(){
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSuperHeroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}