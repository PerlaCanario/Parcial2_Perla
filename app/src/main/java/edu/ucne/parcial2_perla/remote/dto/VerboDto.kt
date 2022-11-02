package edu.ucne.parcial2_perla.remote.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VerboDto(
    val Verbo : String,
    val Categoria : String,
    val Nivel : String,
    val Foto : String

)