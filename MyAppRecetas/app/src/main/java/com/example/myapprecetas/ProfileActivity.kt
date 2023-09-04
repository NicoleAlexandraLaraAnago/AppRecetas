package com.example.myapprecetas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView


class ProfileActivity : AppCompatActivity() {

    private lateinit var textViewUsername: TextView
    private lateinit var buttonRecipes: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        textViewUsername = findViewById(R.id.textViewUsername)
        buttonRecipes = findViewById(R.id.buttonRecipes)

        val username = intent.getStringExtra("username")
        textViewUsername.text = username

        // Configurar el click listener del botón de recetas
        buttonRecipes.setOnClickListener {
            val intent = Intent(this, RecipeDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}
