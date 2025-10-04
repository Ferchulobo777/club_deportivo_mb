package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TurnosAgregaractivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_turnos_agregar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profesionales = mutableListOf("Seleccionar Profesional", "Lic. Messi", "Lic. Perez", "Profesional 3")
        val adapterProfesionales = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            profesionales
        )

        adapterProfesionales.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val spnProfesional = findViewById<Spinner>(R.id.spnSeleccionarProfesional)
        spnProfesional.adapter = adapterProfesionales

        val btnGuardarTurno = findViewById<Button>(R.id.btnGuardarTurno)
        btnGuardarTurno.setOnClickListener {
            val intent = Intent(this, AgregarActividadActivity::class.java)
            startActivity(intent)
        }
    }
}