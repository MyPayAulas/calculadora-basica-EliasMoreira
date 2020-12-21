package com.example.calculadora_elias.CustomListView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.calculadora_elias.Model.HistoricoCalculos
import com.example.calculadora_elias.R

class HistoricoCalculoAdapter(val context: Context, val historico:HistoricoCalculos): BaseAdapter() {

    override fun getCount(): Int {
        return historico.listaCalculos.size
    }

    override fun getItem(position: Int): Any {
        return historico.listaCalculos[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View
        val holder: ViewHolder

        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_view_item_historico, parent, false)
            holder = ViewHolder(view)
             view.tag = holder
        }else{
            view = convertView
            holder = view.tag as ViewHolder
        }

        val calc = historico.listaCalculos[position]
        /*val text_view_expressao = view.findViewById<TextView>(R.id.txtCalculo)
        val text_view_resultado = view.findViewById<TextView>(R.id.txtResultadoCalc)
        text_view_expressao.text = calc.expressao
        text_view_resultado.text = calc.resultado*/

        holder.expressao?.text = calc.expressao
        holder.resultado?.text = calc.resultado

        return view
    }
}