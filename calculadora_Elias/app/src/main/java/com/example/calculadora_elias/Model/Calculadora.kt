package com.example.calculadora_elias.Model

class Calculadora() {
    private var op:String = ""
    private var num1 = ""
    private var resultado:Double = 0.0
    private var num = ""
    private var indice = 0
    private val operations = listOf("+", "-", "x", "/")
    private var newExpressao: MutableList<String>? = mutableListOf()

    private fun desmonta_operacao(){
        for (i in op) {
            indice++
            if (operations.contains(i.toString())) { //verifica operador pra somar numeros antigos
                newExpressao!!.add(num!!) //adiciona numeros juntos
                newExpressao!!.add(i.toString()) //adiciona operador
                num = ""
            } else {
                num += i //juntando os numeros antes do operador
                if (indice == op.length) //verifica fim da expressao, adicionar last num
                    newExpressao!!.add(num)
            }
        }
        num = ""
    }

    fun calcula_operacao(s:String):Double{
        resultado = 0.0
        op = s
        desmonta_operacao()
        indice = 0
        for (elemento in newExpressao!!){
            if (operations.contains(elemento)){
                when(elemento){
                    "/" -> {
                        if (resultado == 0.0){
                            //soma com o proximo elemento
                            resultado = num1.toDouble() / newExpressao!!.elementAt(indice+1).toDouble()
                            num1 = ""
                        }else{
                            resultado /= newExpressao!!.elementAt(indice+1).toDouble()
                        }
                    }
                    "x" -> {
                        if (resultado == 0.0){
                            //soma com o proximo elemento
                            resultado = num1.toDouble() * newExpressao!!.elementAt(indice+1).toDouble()
                            num1 = ""
                        }else{
                            resultado *= newExpressao!!.elementAt(indice+1).toDouble()
                        }
                    }
                    "+" -> {
                        if (resultado == 0.0){
                            //soma com o proximo elemento
                            resultado = num1.toDouble() + newExpressao!!.elementAt(indice+1).toDouble()
                            num1 = ""
                        }else{
                            resultado += newExpressao!!.elementAt(indice+1).toDouble()
                        }
                    }
                    "-" -> {
                        if (resultado == 0.0){
                            //soma com o proximo elemento
                            resultado = num1.toDouble() - newExpressao!!.elementAt(indice+1).toDouble()
                            num1 = ""
                        }else{
                            resultado -= newExpressao!!.elementAt(indice+1).toDouble()
                        }
                    }
                }
            }else{
                num1 = elemento
            }
            indice++
        }
        newExpressao!!.clear()
        indice = 0
        return resultado
    }
}