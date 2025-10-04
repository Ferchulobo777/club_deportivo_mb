package com.example.clubdeportivomb

// Importa las clases necesarias al principio de tu archivo
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ClienteMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1. Vincula esta clase con su archivo XML de layout
        setContentView(R.layout.activity_cliente_menu)

        // 2. Busca el botón en el layout usando su ID
        val btnNuevoCliente = findViewById<Button>(R.id.btnNuevoCliente)

        // 3. Asigna la acción que se ejecutará al hacer clic en el botón
        btnNuevoCliente.setOnClickListener {
            // 4. Crea un "Intent" para ir de esta Activity (this) a la nueva (NuevoClienteActivity)
            val intent = Intent(this, NuevoClienteActivity::class.java)

            // 5. Inicia la nueva Activity
            startActivity(intent)
        }

        // --- OPCIONAL: Puedes hacer lo mismo para los otros botones ---
        /*
        val btnModificarCliente = findViewById<Button>(R.id.btnModificarCliente)
        btnModificarCliente.setOnClickListener {
            // Crea una ModificarClienteActivity y navega hacia ella
            // val intent = Intent(this, ModificarClienteActivity::class.java)
            // startActivity(intent)
        }
        */
    }
}