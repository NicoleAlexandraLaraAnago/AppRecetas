package com.example.myapprecetas

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class RecipeDetailsActivity : AppCompatActivity() {

    private lateinit var imageViewRecipe1: ImageView
    private lateinit var imageViewRecipe2: ImageView
    private lateinit var imageViewRecipe3: ImageView
    private lateinit var imageViewRecipe4: ImageView
    private lateinit var imageViewRecipe5: ImageView
    private lateinit var imageViewRecipe6: ImageView
    private lateinit var imageViewRecipe7: ImageView
    private lateinit var imageViewRecipe8: ImageView
    private lateinit var searchViewRecipe: SearchView
    private lateinit var imageView5: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_details)

        imageViewRecipe1 = findViewById(R.id.imageViewRecipe1)
        imageViewRecipe2 = findViewById(R.id.imageViewRecipe2)
        imageViewRecipe3 = findViewById(R.id.imageViewRecipe3)
        imageViewRecipe4 = findViewById(R.id.imageViewRecipe4)
        imageViewRecipe5 = findViewById(R.id.imageViewRecipe5)
        imageViewRecipe6 = findViewById(R.id.imageViewRecipe6)
        imageViewRecipe7 = findViewById(R.id.imageViewRecipe7)
        imageViewRecipe8 = findViewById(R.id.imageViewRecipe8)
        searchViewRecipe = findViewById(R.id.searchViewRecipe)
        imageView5 = findViewById(R.id.imageView5)

        imageViewRecipe1.setOnClickListener {
            navigateToRecipeDetails("Carne Asada")
        }
        imageViewRecipe2.setOnClickListener {
            navigateToRecipeDetails("Chaulafan")
        }
        imageViewRecipe3.setOnClickListener {
            navigateToRecipeDetails("Sopa de Pollo")
        }
        imageViewRecipe4.setOnClickListener {
            navigateToRecipeDetails("Arroz Relleno")
        }
        imageViewRecipe5.setOnClickListener {
            navigateToRecipeDetails("Pollo Salteado")
        }
        imageViewRecipe6.setOnClickListener {
            navigateToRecipeDetails("Chugchucara")
        }
        imageViewRecipe7.setOnClickListener {
            navigateToRecipeDetails("Hornado")
        }
        imageViewRecipe8.setOnClickListener {
            navigateToRecipeDetails("Papas con Cuero")
        }

        imageView5.setOnClickListener {
            navigateToAnotherScreen()
        }

        // Configurar el listener para la búsqueda de recetas
        searchViewRecipe.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Realizar la búsqueda de recetas aquí
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Realizar la búsqueda de recetas en tiempo real aquí
                return true
            }
        })
    }

    private fun navigateToRecipeDetails(recipeName: String) {
        val intent = Intent(this, RecipeDetailsSelectedActivity::class.java)
        intent.putExtra("recipeName", recipeName)
        startActivity(intent)
    }

    private fun navigateToAnotherScreen() {
        val intent = Intent(this, RecipeAnotherActivity::class.java)
        startActivity(intent)
    }
}
