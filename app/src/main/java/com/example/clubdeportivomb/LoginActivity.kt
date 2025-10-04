package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Vincula esta Activity con su layout XML
        setContentView(R.layout.layout_login)

        // 2. Referencia a los componentes del layout
        val inputUsuario = findViewById<EditText>(R.id.title_inputUsuario)
        val inputPassword = findViewById<EditText>(R.id.title_inputPassword)
        val btnIngresar = findViewById<Button>(R.id.title_btnIngresar)

        // 3. Define la acción que ocurrirá al pulsar el botón "Ingresar"
        btnIngresar.setOnClickListener {
            // Obtenemos el texto que el usuario escribió
            val usuario = inputUsuario.text.toString()
            val password = inputPassword.text.toString()

            // 4. Lógica de validación (ejemplo simple)
            // Aquí deberías poner tu lógica de validación real
            if (usuario == "admin" && password == "1234") {
                // Si el login es correcto, navegamos al menú principal
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                // Cerramos LoginActivity para que el usuario no vuelva aquí con el botón "Atrás"
                finish()
            } else {
                // Si el login es incorrecto, mostramos un mensaje de error
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
