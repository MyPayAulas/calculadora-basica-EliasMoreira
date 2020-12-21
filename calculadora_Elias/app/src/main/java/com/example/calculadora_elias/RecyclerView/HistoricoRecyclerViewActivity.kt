package com.example.calculadora_elias.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.calculadora_elias.Model.HistoricoCalculos
import com.example.calculadora_elias.R
import kotlinx.android.synthetic.main.activity_historico_recycler_view.*

class HistoricoRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico_recycler_view)

        var listaHistorico = intent.getParcelableExtra<HistoricoCalculos>("lista")

        list_recycler_view.layoutManager = LinearLayoutManager(this)
        if (listaHistorico != null) list_recycler_view.adapter = HistoricoRecyclerAdapter(this, listaHistorico)

        list_recycler_view.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))
    }
}