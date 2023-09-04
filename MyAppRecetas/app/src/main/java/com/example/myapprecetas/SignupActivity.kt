package com.example.myapprecetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapprecetas.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding // Corrige el nombre de la clase aquí
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.buttonEnviar.setOnClickListener{
            val email = binding.editTextEmail.text.toString()
            val pass = binding.editTextPassword.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email,pass)
                    .addOnCompleteListener(this) {task ->
                        if(task.isSuccessful){
                            Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this, Login1Activity::class.java)
                            startActivity(intent)
                            finish()
                        }else{
                            Toast.makeText(this, "UnSuccessful", Toast.LENGTH_SHORT).show()
                        }
                    }
            }else {
                Toast.makeText(this, "Enter email and pass", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
