package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AsignarActividadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_asignar_actividad)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profesores = mutableListOf("Seleccionar Profesor a asignar", "Wanda Nara", "Fede Bal", "Morena Rial")

        val adapterProfesores = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            profesores
        )

        adapterProfesores.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val spnProfesores = findViewById<Spinner>(R.id.spnAsignarActividad)
        spnProfesores.adapter = adapterProfesores

        val btnAsignarActividad = findViewById<Button>(R.id.btnAsignarActividad)
        btnAsignarActividad.setOnClickListener {
            val intent = Intent(this, AsignarActividadAProfesorActivity::class.java)
            startActivity(intent)
        }

        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, ActividadesMenuActivity::class.java)
            startActivity(intent)
        }
    }
}