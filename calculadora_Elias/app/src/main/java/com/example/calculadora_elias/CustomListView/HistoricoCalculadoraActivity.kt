package com.example.calculadora_elias.CustomListView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora_elias.Model.HistoricoCalculos
import com.example.calculadora_elias.R
import kotlinx.android.synthetic.main.activity_historico_calculadora.*

class HistoricoCalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico_calculadora)

        var listaHistorico = intent.getParcelableExtra<HistoricoCalculos>("lista")

        if (listaHistorico != null){
            val adapter = HistoricoCalculoAdapter(this, listaHistorico)
            listViewHistorico.adapter = adapter
        }

    }
}