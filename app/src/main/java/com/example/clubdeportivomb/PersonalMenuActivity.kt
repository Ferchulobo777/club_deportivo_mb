package com.example.clubdeportivomb


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton
import android.widget.Button
import android.content.Intent


class PersonalMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_menu)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        // Flecha de volver
        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }


        //Añadir nuevo personal
        val btnNuevo = findViewById<Button>(R.id.boton_nuevop)
        btnNuevo.setOnClickListener {
            val intent = Intent(this, PersonalNuevoActivity::class.java)
            startActivity(intent)
        }


        //Modificar personal
        val btnModificar = findViewById<Button>(R.id.boton_modificarp)
        btnModificar.setOnClickListener {
            val intent = Intent(this, PersonalModificarActivity::class.java)
            startActivity(intent)
        }


        //Buscar personal
        val btnBuscar = findViewById<Button>(R.id.boton_buscarp)
        btnBuscar.setOnClickListener {
            val intent = Intent(this, PersonalBuscarActivity::class.java)
            startActivity(intent)
        }
    }
}


