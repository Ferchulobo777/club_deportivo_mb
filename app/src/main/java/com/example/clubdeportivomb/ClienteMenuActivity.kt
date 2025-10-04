package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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



//        val btnVolver = findViewById<Button>(R.id.btnVolver)
//        btnVolver.setOnClickListener {
//           finish() // Cierra esta pantalla y vuelve a la anterior
//        }
    }
}
