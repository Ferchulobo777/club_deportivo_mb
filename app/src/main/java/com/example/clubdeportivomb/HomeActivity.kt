package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnTurnosMenu = findViewById<androidx.cardview.widget.CardView>(R.id.btnTurnos)
        btnTurnosMenu.setOnClickListener {
            val intent = Intent(this, TurnosMenuActivity::class.java)
            startActivity(intent)
        }

        val btnClientesMenuActivity = findViewById<androidx.cardview.widget.CardView>(R.id.btnClientes)
        btnClientesMenuActivity.setOnClickListener {
            val intent = Intent(this, ClienteMenuActivity::class.java)
            startActivity(intent)
        }

        val btnActividadesMenuActivity = findViewById<androidx.cardview.widget.CardView>(R.id.btnActividades)
        btnActividadesMenuActivity.setOnClickListener {
            val intent = Intent(this, ActividadesMenuActivity::class.java)
            startActivity(intent)
        }

        val btnPersonalMenuActivity = findViewById<androidx.cardview.widget.CardView>(R.id.btnPersonal)
        btnPersonalMenuActivity.setOnClickListener {
            val intent = Intent(this, PersonalMenuActivity::class.java)
            startActivity(intent)
        }

    }
}