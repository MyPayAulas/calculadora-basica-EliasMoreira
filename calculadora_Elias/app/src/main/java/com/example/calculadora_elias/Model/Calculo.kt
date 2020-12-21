package com.example.calculadora_elias.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Calculo(var expressao:String?, val resultado:String?): Parcelable