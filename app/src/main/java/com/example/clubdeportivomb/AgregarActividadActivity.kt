package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Spinner

class AgregarActividadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_agregar_actividad)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profesores = mutableListOf("Seleccionar Profesor", "Profesor A", "Profesor B", "Profesor C")

        val adapterProfesores = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            profesores
        )

        adapterProfesores.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val spnProfesor = findViewById<Spinner>(R.id.spnProfesorActividad)
        spnProfesor.adapter = adapterProfesores

        val salones = mutableListOf("Salón central", "Cancha", "Pista de entrenamiento")

        val adapterSalones = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            salones
        )

        adapterSalones.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val spnSalones = findViewById<Spinner>(R.id.spnSalonActividad)
        spnSalones.adapter = adapterSalones

        val btnGuardarActividad = findViewById<Button>(R.id.btnGuardarActividad)
        btnGuardarActividad.setOnClickListener {
            val intent = Intent(this, AgregarActividadActivity::class.java)
            startActivity(intent)
        }
    }
}