package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InformacionActividadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_informacion_actividad)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAsignarActividad = findViewById<Button>(R.id.btnEliminarActividad)
        btnAsignarActividad.setOnClickListener {
            val intent = Intent(this, InformacionActividadActivity::class.java)
            startActivity(intent)
        }

        val btnEditarActividad = findViewById<Button>(R.id.btnEditarActividad)
        btnEditarActividad.setOnClickListener {
            val intent = Intent(this, InformacionActividadActivity::class.java)
            startActivity(intent)
        }

        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, BuscarActividadActivity::class.java)
            startActivity(intent)
        }
    }
}