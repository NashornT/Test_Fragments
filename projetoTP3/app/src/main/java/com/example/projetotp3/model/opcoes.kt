package com.example.projetotp3.model

import kotlinx.serialization.Serializable

@Serializable
data class opcoes(var numeros: MutableList<Int> = mutableListOf<Int>() )
