package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TurnosMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_turnos_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnTurnosAgregaractivity = findViewById<Button>(R.id.btnAgendarNuevoTurnoMenu)
        btnTurnosAgregaractivity.setOnClickListener {
            val intent = Intent(this, TurnosAgregaractivity::class.java)
            startActivity(intent)
        }
        val btnTurnosModificarActivity = findViewById<Button>(R.id.btnModificarTurnoMenu)
        btnTurnosModificarActivity.setOnClickListener {
            val intent = Intent(this, TurnosModificarActivity::class.java)
            startActivity(intent)
        }
        val btnTurnosBuscarActivity = findViewById<Button>(R.id.btnBuscarTurnosMenu)
        btnTurnosBuscarActivity.setOnClickListener {
            val intent = Intent(this, TurnosBuscarActivity::class.java)
            startActivity(intent)
        }

        val btnTurnosCargarConsultaActivity = findViewById<Button>(R.id.btnCargarConsultaMenu)
        btnTurnosCargarConsultaActivity.setOnClickListener {
            val intent = Intent(this, TurnosCargarConsultaActivity::class.java)
            startActivity(intent)
        }

        val btnTurnosConsultarHistoriaClinicaActivity = findViewById<Button>(R.id.btnHistorialDeConsultasMenu)
        btnTurnosConsultarHistoriaClinicaActivity.setOnClickListener {
            val intent = Intent(this, TurnosConsultarHistoriaClinicaActivity::class.java)
            startActivity(intent)
        }


        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


    }
}