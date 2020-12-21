package com.example.calculadora_elias.RecyclerView

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.calculadora_elias.Model.HistoricoCalculos
import com.example.calculadora_elias.R

class HistoricoRecyclerAdapter(val context: Context, val historico: HistoricoCalculos): RecyclerView.Adapter<HistoricoRecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_view_item_historico, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val calc = historico.listaCalculos[position]
        holder.expressao.text = calc.expressao
        holder.resultado.text = calc.resultado
    }

    override fun getItemCount(): Int {
        return historico.listaCalculos.size
    }

    class ViewHolder (item : View) : RecyclerView.ViewHolder(item), View.OnClickListener {
        var expressao: TextView = item.findViewById(R.id.txtCalculo)
        var resultado: TextView = item.findViewById(R.id.txtResultadoCalc)

        init {
            item.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            val position = adapterPosition
            Toast.makeText(v.context, "Clicou no item da posição: $position", Toast.LENGTH_SHORT).show()
        }
    }
}