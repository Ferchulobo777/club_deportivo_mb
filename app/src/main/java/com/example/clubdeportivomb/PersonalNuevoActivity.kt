package com.example.clubdeportivomb

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class PersonalNuevoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_nuevo)

        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, PersonalMenuActivity::class.java)
            startActivity(intent)
            finish()
        }
}
}
