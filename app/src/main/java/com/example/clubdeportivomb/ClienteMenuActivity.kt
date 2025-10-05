package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ClienteMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cliente_menu)

        // 1. Botón para ir a "Nuevo Cliente"
        val btnNuevoCliente = findViewById<Button>(R.id.btnNuevoCliente)
        btnNuevoCliente.setOnClickListener {
            val intent = Intent(this, ClienteNuevoActivity::class.java)
            startActivity(intent)
        }

        // 2. Botón para ir a "Buscar Cliente"
        val btnModificar = findViewById<Button>(R.id.btnBuscarCliente)
        btnModificar.setOnClickListener {
            val intent = Intent(this, ClienteBuscarActivity::class.java)
            startActivity(intent)
        }

        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
