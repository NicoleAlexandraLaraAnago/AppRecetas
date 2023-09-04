package com.example.myapprecetas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class PrincipalActivity : AppCompatActivity() {

    private lateinit var btnIniciarSesion: Button
    private lateinit var btnIr: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btnIniciarSesion = findViewById(R.id.btnIniciarSesion)

        btnIniciarSesion.setOnClickListener {
            val intent = Intent(this, Login1Activity::class.java)
            startActivity(intent)
        }


    }
}

