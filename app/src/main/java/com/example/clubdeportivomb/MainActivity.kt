package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {// Define el tiempo que durará la pantalla de bienvenida en milisegundos
private val splashTimeOut: Long = 1000 // 3 segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Vincula esta clase con el layout de la pantalla de bienvenida
        setContentView(R.layout.activity_main)

        // Crea un manejador para ejecutar una acción después de un retraso
        Handler(Looper.getMainLooper()).postDelayed({
            // Este código se ejecutará pasados los 3 segundos

            // 1. Prepara la navegación hacia la LoginActivity
            val intent = Intent(this, LoginActivity::class.java)

            // 2. Ejecuta la navegación
            startActivity(intent)

            // 3. Cierra MainActivity para que el usuario no pueda volver a ella
            //    con el botón "Atrás". ¡Esto es muy importante!
            finish()

        }, splashTimeOut)
    }
}
