package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
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

        val profesores = mutableListOf("Profesor A", "Profesor B", "Profesor C")

        val adapterProfesores = ArrayAdapter(
            this,
            R.layout.spinner,
            profesores
        )

        adapterProfesores.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val spnProfesor = findViewById<Spinner>(R.id.spnProfesorActividad)
        spnProfesor.adapter = adapterProfesores
        spnProfesor.setOnTouchListener { _, _ ->true }

        val salones = mutableListOf("Salón central", "Cancha", "Pista de entrenamiento")

        val adapterSalones = ArrayAdapter(
            this,
            R.layout.spinner,
            salones
        )

        adapterSalones.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val spnSalones = findViewById<Spinner>(R.id.spnSalonActividad)
        spnSalones.adapter = adapterSalones
        spnSalones.setOnTouchListener { _, _ ->true }

        val btnEliminarActividad = findViewById<Button>(R.id.btnEliminarActividad)
        btnEliminarActividad.setOnClickListener {
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