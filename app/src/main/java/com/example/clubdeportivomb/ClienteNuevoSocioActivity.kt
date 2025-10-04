package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ClienteNuevoSocioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cliente_socio_nuevo)


        val btnGuardar = findViewById<Button>(R.id.btnGuardarSocio)
        btnGuardar.setOnClickListener {
            val intent = Intent(this, ClienteMenuActivity::class.java)
            startActivity(intent)
        }

    }
}