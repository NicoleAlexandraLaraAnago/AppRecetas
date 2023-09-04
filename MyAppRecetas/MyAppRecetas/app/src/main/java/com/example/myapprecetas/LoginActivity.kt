package com.example.myapprecetas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        // Configurar el click listener del botón de inicio de sesión
        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Comprobar las credenciales de inicio de sesión
            if (username == "admin" && password == "admin") {
                // Iniciar sesión exitoso, navegar a la página de perfil
                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
            } else {
                // Mostrar un mensaje de error en caso de credenciales incorrectas
                Toast.makeText(this, "Credenciales inválidas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
