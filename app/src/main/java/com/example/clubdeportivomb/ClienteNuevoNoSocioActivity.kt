package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ClienteNuevoNoSocioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cliente_nosocio_nuevo)


        val btnGuardar = findViewById<Button>(R.id.btnGuardarNSocio)
        btnGuardar.setOnClickListener {
            val intent = Intent(this, ClienteMenuActivity::class.java)
            startActivity(intent)
        }

    }
}