package com.amaurypm.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.amaurypm.app1.databinding.MiDisenioBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MiDisenioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MiDisenioBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //setContentView(R.layout.mi_disenio)

        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        val button2 = findViewById<Button>(R.id.btnBoton2)


        tvSaludo.setOnClickListener {
            tvSaludo.text = "Cómputo Móvil"
        }

        binding.btnSaludar.setOnClickListener {
            binding.tvSaludo.text = "Este es un saludo"
        }

    }

    fun click(view: View){
        binding.tvSaludo.text = "Click en el botón 2"
    }

}