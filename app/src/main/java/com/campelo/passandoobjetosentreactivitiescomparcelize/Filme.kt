package com.campelo.passandoobjetosentreactivitiescomparcelize

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Filme(
    val nome: String,
    val duracao: Double,
    val distribuidor: String
): Parcelable
