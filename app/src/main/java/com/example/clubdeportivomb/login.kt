package com.example.clubdeportivomb
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)  // usa tu XML de login

        val registrarse: TextView = findViewById(R.id.title_registro)
        registrarse.setOnClickListener {
            val intent = Intent(this, Registrousuario::class.java)
            startActivity(intent)
        }
    }
}
