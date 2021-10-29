package com.example.calculadoradroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var botao0: Button
    lateinit var botao1: Button
    lateinit var botao2: Button
    lateinit var botao3: Button
    lateinit var botao4: Button
    lateinit var botao5: Button
    lateinit var botao6: Button
    lateinit var botao7: Button
    lateinit var botao8: Button
    lateinit var botao9: Button
    lateinit var botaoadi: Button
    lateinit var botaosub: Button
    lateinit var botaomul: Button
    lateinit var botaodiv: Button
    lateinit var botaores: Button
    lateinit var botaocomp: Button
    lateinit var botaolimp: Button
    lateinit var botaosair: Button

    lateinit var txtRes: TextView

    var aux : Double = 0.0
    var proxval = false
    var op = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao0 = findViewById(R.id.btn0)
        botao1 = findViewById(R.id.btn1)
        botao2 = findViewById(R.id.btn2)
        botao3 = findViewById(R.id.btn3)
        botao4 = findViewById(R.id.btn4)
        botao5 = findViewById(R.id.btn5)
        botao6 = findViewById(R.id.btn6)
        botao7 = findViewById(R.id.btn7)
        botao8 = findViewById(R.id.btn8)
        botao9 = findViewById(R.id.btn9)
        botaoadi = findViewById(R.id.btnadi)
        botaosub = findViewById(R.id.btnsub)
        botaomul = findViewById(R.id.btnmul)
        botaodiv = findViewById(R.id.btndiv)
        botaores = findViewById(R.id.btnres)
        botaocomp = findViewById(R.id.btncomp)
        botaolimp = findViewById(R.id.btnlimp)
        botaosair = findViewById(R.id.btnsair)
        txtRes = findViewById(R.id.txtRes)

        var adi=0
        var sub=0
        var mul=0
        var div=0



        botaocomp.setOnClickListener() {
            val outraTela = Intent(this, Compartilhar::class.java)
            outraTela.putExtra("resultado", txtRes.text.toString())
            startActivity(outraTela)

        }

        botaolimp.setOnClickListener() {
            txtRes.setText("0")
            proxval=false
            aux=0.0
            adi=0
            sub=0
            mul=0
            div=0

        }

        botaosair.setOnClickListener() {
            this.finishAffinity()
        }

        botao0.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("0")
                proxval=false
            }
            else
                txtRes.append("0")

        }

        botao1.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("1")
                proxval=false
            }
            else
                txtRes.append("1")

        }

        botao2.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("2")
                proxval=false
            }
            else
                txtRes.append("2")

        }

        botao3.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("3")
                proxval=false
            }
            else
                txtRes.append("3")

        }

        botao4.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("4")
                proxval=false
            }
            else
                txtRes.append("4")

        }

        botao5.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("5")
                proxval=false
            }
            else
                txtRes.append("5")

        }

        botao6.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("6")
                proxval=false
            }
            else
                txtRes.append("6")

        }

        botao7.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("7")
                proxval=false
            }
            else
                txtRes.append("7")

        }

        botao8.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("8")
                proxval=false
            }
            else
                txtRes.append("8")

        }

        botao9.setOnClickListener() {
            if ((txtRes.text.toString() == "0") || (proxval)) {
                txtRes.setText("9")
                proxval=false
            }
            else
                txtRes.append("9")

        }

        botaoadi.setOnClickListener() {

            if (sub>0) {
                txtRes.text = calcular("-", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            if (mul>0) {
                txtRes.text = calcular("*", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            if (div>0) {
                txtRes.text = calcular("/", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }

            sub=0
            mul=0
            div=0

            if (adi>0) {
                txtRes.text = calcular("+", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            aux = txtRes.text.toString().toDouble()

            proxval = true
            adi++

        }
        botaosub.setOnClickListener() {

            if (adi>0) {
                txtRes.text = calcular("+", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            if (mul>0) {
                txtRes.text = calcular("*", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            if (div>0) {
                txtRes.text = calcular("/", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }

            adi=0
            mul=0
            div=0

            if (sub>0) {
                txtRes.text = calcular("-", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            aux = txtRes.text.toString().toDouble()

            proxval = true
            sub++

        }
        botaomul.setOnClickListener() {

            if (sub>0) {
                txtRes.text = calcular("-", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            if (adi>0) {
                txtRes.text = calcular("+", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            if (div>0) {
                txtRes.text = calcular("/", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }

            sub=0
            adi=0
            div=0

            if (mul>0) {
                txtRes.text = calcular("*", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            aux = txtRes.text.toString().toDouble()

            proxval = true
            mul++

        }
        botaodiv.setOnClickListener() {

            if (sub>0) {
                txtRes.text = calcular("-", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            if (mul>0) {
                txtRes.text = calcular("*", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            if (adi>0) {
                txtRes.text = calcular("+", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }

            sub=0
            mul=0
            adi=0

            if (div>0) {
                txtRes.text = calcular("/", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
            }
            aux = txtRes.text.toString().toDouble()

            proxval = true
            div++

        }

        botaores.setOnClickListener() {
            if (sub>0) {
                txtRes.text = calcular("-", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
                //sub++
            }
            if (mul>0) {
                txtRes.text = calcular("*", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
                //mul++
            }
            if (adi>0) {
                txtRes.text = calcular("+", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
                //adi++
            }
            if (div>0) {
                txtRes.text = calcular("/", aux, txtRes.text.toString().toDouble()).toString()
                aux = txtRes.text.toString().toDouble()
                //div++
            }
            proxval = true
            sub=0
            mul=0
            adi=0
            div=0

        }

    }

    private fun calcular(op: String, num1: Double, num2 : Double): Any {
        return when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> try {num1 / num2} catch (ex: ArithmeticException) {
                Toast.makeText(this, "Não é possível dividir por zero" , Toast.LENGTH_SHORT).show()
            }
            else -> 0.0
        }

    }

}