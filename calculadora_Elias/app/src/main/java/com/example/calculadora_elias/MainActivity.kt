package com.example.calculadora_elias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val calculadora: Calculadora = Calculadora()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtOperacao.text = ""

        btnC.setOnClickListener {
            txtOperacao.text = ""
            txtResultado.text = ""
        }

        btn0.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "0" }
        btn1.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "1" }
        btn2.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "2" }
        btn3.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "3" }
        btn4.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "4" }
        btn5.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "5" }
        btn6.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "6" }
        btn7.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "7" }
        btn8.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "8" }
        btn9.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "9" }

        btn_div.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "/"}
        btn_multi.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "x" }
        btn_soma.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "+" }
        btn_menos.setOnClickListener { txtOperacao.text = txtOperacao.text as String + "-" }

        btn_delete.setOnClickListener {
            val expressao = txtOperacao.text.toString()

            if (!expressao.trim().isBlank())
                txtOperacao.text = expressao.take(expressao.length - 1)
        }

        btn_result.setOnClickListener {
            txtResultado.text = calculadora.calcula_operacao(txtOperacao.text.toString()).toString()
        }
    }
}