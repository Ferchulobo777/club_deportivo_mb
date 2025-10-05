package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.clubdeportivomb.R

class ClienteVerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cliente_ver)


        // 1. Botón para ir a "Editar Cliente"

        val btnEdit = findViewById<Button>(R.id.btnEditar)
        btnEdit.setOnClickListener {
            val intent = Intent(this, ClienteEditarActivity::class.java)
            startActivity(intent)
        }

        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, ClienteBuscarActivity::class.java)
            startActivity(intent)
        }

    }
}