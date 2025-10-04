package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ClienteBuscarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cliente_buscar)


        // 1. Boton para ir a "Buscar Info del Cliente"
        val btnBuscarClienteVer = findViewById<Button>(R.id.btnBuscarCliente)
        btnBuscarClienteVer.setOnClickListener {
            val intent = Intent(this, ClienteVerActivity::class.java)
            startActivity(intent)
        }
    }
}