package com.example.clubdeportivomb

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import com.example.clubdeportivomb.R

class ClienteEditarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cliente_socio_editar)

        val btnGuardar = findViewById<Button>(R.id.btnGuardarE)
        btnGuardar.setOnClickListener {
            val intent = Intent(this, ClienteMenuActivity::class.java)
            startActivity(intent)
        }

    }
}