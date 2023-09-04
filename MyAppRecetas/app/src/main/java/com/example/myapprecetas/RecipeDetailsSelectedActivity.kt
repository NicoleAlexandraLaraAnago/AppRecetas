package com.example.myapprecetas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecipeDetailsSelectedActivity : AppCompatActivity() {

    private lateinit var textViewIngredients: TextView
    private lateinit var textViewSteps: TextView
    private lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_details_selected)

        textViewIngredients = findViewById(R.id.textViewIngredients)
        textViewSteps = findViewById(R.id.textViewSteps)
        buttonBack = findViewById(R.id.buttonBack)

        val recipeName = intent.getStringExtra("recipeName")

        val ingredients = when (recipeName) {
            "Carne Asada" -> "Ingredientes:\n- Carne de res\n- Sal\n- Pimienta\n- Limón\n- Aceite de oliva"
            "Chaulafan" -> "Ingredientes:\n- Arroz\n- Pollo\n- Camarones\n- Verduras variadas\n- Salsa de soja\n- Aceite de sésamo"
            "Sopa de Pollo" -> "Ingredientes:\n- Pollo\n- Zanahorias\n- Papas\n- Cebolla\n- Ajo\n- Caldo de pollo\n- Sal\n- Pimienta"
            "Arroz Relleno" -> "Ingredientes:\n- Arroz\n- Carne de cerdo\n- Pasas\n- Aceitunas\n- Cebolla\n- Pimiento\n- Ajo\n- Comino\n- Sal"
            "Pollo Sauté" -> "Ingredientes:\n- Pechugas de pollo\n- Champiñones\n- Cebolla\n- Pimiento\n- Ajo\n- Salsa de soja\n- Aceite de oliva"
            "Chugchucara" -> "Ingredientes:\n- Cerdo\n- Yuca\n- Maíz\n- Plátano\n- Chicharrón\n- Salsa de maní\n- Salsa picante\n- Sal"
            "Hornado" -> "Ingredientes:\n- Cerdo\n- Achiote\n- Comino\n- Sal\n- Cerveza\n- Naranjas\n- Hojas de plátano"
            "Papas con Cuero" -> "Ingredientes:\n- Papas\n- Carne de cerdo\n- Comino\n- Orégano\n- Cebolla\n- Ajo\n- Sal\n- Aceite de achiote"
            else -> "No se encontraron los ingredientes para esta receta."
        }

        val preparationSteps = when (recipeName) {
            "Carne Asada" -> "Pasos de preparación:\n1. Sazonar la carne con sal, pimienta y limón.\n2. Dejar reposar durante 30 minutos.\n3. Calentar el aceite de oliva en una parrilla o sartén.\n4. Cocinar la carne a fuego medio-alto durante 8-10 minutos por cada lado.\n5. Retirar del fuego y dejar reposar durante unos minutos antes de cortar y servir."
            "Chaulafan" -> "Pasos de preparación:\n1. Cocinar el arroz siguiendo las instrucciones del paquete.\n2. Saltear el pollo, camarones y las verduras en aceite.\n3. Mezclar el arroz cocido con la preparación de pollo y camarones.\n4. Agregar salsa de soja y aceite de sésamo al gusto.\n5. Revolver bien y servir caliente."
            "Sopa de Pollo" -> "Pasos de preparación:\n1. En una olla grande, hervir el pollo con suficiente agua para cubrirlo.\n2. Agregar las zanahorias, papas, cebolla y ajo a la olla.\n3. Cocinar a fuego medio hasta que las verduras estén tiernas.\n4. Retirar el pollo de la olla, desmenuzarlo y volver a añadir a la sopa.\n5. Condimentar con sal y pimienta al gusto y servir caliente."
            "Arroz Relleno" -> "Pasos de preparación:\n1. Cocinar el arroz siguiendo las instrucciones del paquete.\n2. En una sartén, saltear la carne de cerdo con cebolla, ajo, pimiento y comino.\n3. Mezclar el arroz cocido con la preparación de carne, pasas y aceitunas.\n4. Rellenar una bandeja de horno con la mezcla y hornear a 180°C durante 30 minutos.\n5. Servir caliente."
            "Pollo Sauté" -> "Pasos de preparación:\n1. Cortar las pechugas de pollo en trozos pequeños.\n2. En una sartén grande, saltear el pollo con champiñones, cebolla, pimiento y ajo.\n3. Agregar salsa de soja al gusto y cocinar hasta que el pollo esté bien cocido.\n4. Servir caliente con arroz o verduras al lado.\n5. Opcionalmente, puedes añadir un poco de aceite de oliva antes de servir."
            "Chugchucara" -> "Pasos de preparación:\n1. Cocinar el cerdo en una olla grande con agua y sal hasta que esté tierno.\n2. Aparte, cocinar la yuca, el maíz y el plátano en agua con sal.\n3. Escurrir los ingredientes y freír el cerdo y el plátano hasta que estén dorados.\n4. Servir los ingredientes fritos junto con chicharrón y salsas de maní y picante al lado.\n5. Acompañar con arroz y ensalada."
            "Hornado" -> "Pasos de preparación:\n1. Preparar una mezcla con achiote, comino, sal, cerveza y el jugo de las naranjas.\n2. Marinar el cerdo con la mezcla y dejar reposar durante varias horas o toda la noche.\n3. Envolver el cerdo en hojas de plátano y hornear a baja temperatura durante varias horas hasta que esté tierno y jugoso.\n4. Retirar del horno, desmenuzar la carne y servir caliente.\n5. Acompañar con tortillas de maíz y curtido de cebolla y tomate."
            "Papas con Cuero" -> "Pasos de preparación:\n1. Hervir las papas con piel en agua con sal hasta que estén cocidas.\n2. Aparte, en una sartén grande, saltear la carne de cerdo con cebolla, ajo, comino y orégano.\n3. Añadir las papas cocidas y aplastar ligeramente con un tenedor.\n4. Cocinar hasta que las papas estén doradas y la carne esté bien cocida.\n5. Servir caliente con arroz y aguacate al lado."
            else -> "No se encontraron los ingredientes y pasos de preparación para esta receta."
        }

        textViewIngredients.text = ingredients
        textViewSteps.text = preparationSteps

        buttonBack.setOnClickListener {
            onBackPressed()
        }
    }
}
