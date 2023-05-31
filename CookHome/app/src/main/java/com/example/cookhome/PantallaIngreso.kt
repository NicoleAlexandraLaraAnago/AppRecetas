package com.example.cookhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PantallaIngreso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantallaingreso)

        /*Cambiar de una pantalla a otra con el boto*/

        val btnIraPagina1kt = findViewById<Button>(R.id.button2)
        btnIraPagina1kt.setOnClickListener {

                val nextPage = Intent(this, pantallahome::class.java)
                startActivity(nextPage)
                finish()


        }
    }
}