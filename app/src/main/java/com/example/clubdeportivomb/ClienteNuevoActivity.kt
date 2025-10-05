package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ClienteNuevoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cliente_nuevo)

        val btnSocio = findViewById<Button>(R.id.btnNvoSocio)
        btnSocio.setOnClickListener {
            val intent = Intent(this, ClienteNuevoSocioActivity::class.java)
            startActivity(intent)
        }

        val btnNoSocio = findViewById<Button>(R.id.btnNvoNoSocio)
        btnNoSocio.setOnClickListener {
            val intent = Intent(this, ClienteNuevoNoSocioActivity::class.java)
            startActivity(intent)
        }
    }
}
