package com.example.myapprecetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class RecipeAnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_another)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        imageView2.setOnClickListener {
            val intent = Intent(this, RecipeDetailsActivity::class.java)
            startActivity(intent)
        }

    }
}