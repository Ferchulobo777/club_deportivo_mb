package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActividadesMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_actividades_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAgregarActividad = findViewById<Button>(R.id.btnAgregarActividadMenu)
        btnAgregarActividad.setOnClickListener {
            val intent = Intent(this, AgregarActividadActivity::class.java)
            startActivity(intent)
        }
        val btnBuscarActividad = findViewById<Button>(R.id.btnBuscarActividadMenu)
        btnBuscarActividad.setOnClickListener {
            val intent = Intent(this, BuscarActividadActivity::class.java)
            startActivity(intent)
        }
        val btnAsignarActividad = findViewById<Button>(R.id.btnAsignarActividadMenu)
        btnAsignarActividad.setOnClickListener {
            val intent = Intent(this, AsignarActividadActivity::class.java)
            startActivity(intent)
        }
    }
}