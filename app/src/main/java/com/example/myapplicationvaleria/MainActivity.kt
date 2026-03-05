package com.example.myapplicationvaleria //nombre del paquete
//Package define dónde vive mi código. Usa una DNS inverso para mantener el nombre de mi paquete único en la google play

import android.os.Bundle //dependencias de nuestra actividad
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() { //indica el nombre de la clase
    override fun onCreate(savedInstanceState: Bundle?) { //los dos puntos que indican la herencia de la funcionalidad de appcompatactivity
        super.onCreate(savedInstanceState)
        Log.i("myapp", "HOLA VALERIA")

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() { //override indica que estamos proporcionando una implementación
        super.onStart()
        Log.i("myapp", "HOLA VALERIA")
    }

    override fun onResume() {
        super.onResume()
        Log.i("myapp", "HOLA VALERIA")

    }
}


