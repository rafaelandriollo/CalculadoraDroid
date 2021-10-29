package com.example.calculadoradroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.TextView


class Compartilhar : AppCompatActivity() {

    lateinit var txtResultado: TextView
    lateinit var botaoCompart: Button
    lateinit var botaoCopiar: Button
    lateinit var botaoVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compartillhar)

        txtResultado = findViewById(R.id.txtResult)
        botaoCompart = findViewById(R.id.btnComp)
        botaoCopiar = findViewById(R.id.btnCop)
        botaoVoltar = findViewById(R.id.btnVoltar)

        val parametro = intent.extras

        txtResultado.setText(parametro?.getString("resultado"))

        botaoCompart.setOnClickListener() {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, txtResultado.text.toString())
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

        botaoCopiar.setOnClickListener(){
            val clipboard: ClipboardManager =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("resultado", txtResultado.text.toString())
            clipboard.setPrimaryClip(clip)
        }

        botaoVoltar.setOnClickListener(){
            this.finish();
        }


    }
}