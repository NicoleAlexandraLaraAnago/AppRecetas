package com.example.myapprecetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login1Activity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var btnRegistro:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        firebaseAuth = FirebaseAuth.getInstance()

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)
        btnRegistro=findViewById(R.id.btnRegistro)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Autenticar al usuario con Firebase Authentication
            firebaseAuth.signInWithEmailAndPassword(username, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val user = firebaseAuth.currentUser
                        val intent= Intent(this,ProfileActivity::class.java)
                        intent.putExtra("username", user?.email)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Credenciales inválidas", Toast.LENGTH_SHORT).show()
                    }
                }
        }
        btnRegistro.setOnClickListener{
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}