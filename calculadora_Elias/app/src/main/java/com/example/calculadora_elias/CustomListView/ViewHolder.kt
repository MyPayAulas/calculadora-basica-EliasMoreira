package com.example.calculadora_elias.CustomListView

import android.view.View
import android.widget.TextView
import com.example.calculadora_elias.R
import kotlinx.android.synthetic.main.list_view_item_historico.view.*

internal class ViewHolder(view:View) {
    var expressao:TextView? = null
    var resultado:TextView? = null

    init {
        this.expressao = view.findViewById(R.id.txtCalculo)
        this.resultado = view.findViewById(R.id.txtResultadoCalc)
    }
}