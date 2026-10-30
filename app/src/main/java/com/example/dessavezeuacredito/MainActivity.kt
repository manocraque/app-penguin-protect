package com.example.dessavezeuacredito

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //identificar butao irregistra
        val abu: TextView = findViewById<TextView>(R.id.bt_ir_registrar)

        abu.setOnClickListener{
            ir_registrar()
        }

        //identificar butao loga
        val doido: Button = findViewById<Button>(R.id.logar)
        doido.setOnClickListener {
           logar()
        }
        //identificar butao adaptativo
        val adapta: RadioButton = findViewById<RadioButton>(R.id.adaptativo)
        adapta.setOnClickListener {
            adaptar()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun ir_registrar(){
        val irregistrar = Intent(this,registrarnormal::class.java)
        startActivity(irregistrar)
    }
    fun logar(){
        val entrarlogar = Intent(this, homepage::class.java)
        startActivity(entrarlogar)
    }
    fun adaptar(){
        val adaptare = Intent(this, MainActivityadaptativo::class.java)
        startActivity(adaptare)
    }
}

