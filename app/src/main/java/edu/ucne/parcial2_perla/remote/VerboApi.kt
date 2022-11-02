package edu.ucne.parcial2_perla.remote

import edu.ucne.parcial2_perla.remote.dto.VerboDto
import retrofit2.Response
import retrofit2.http.GET


interface VerboApi {
    @GET("Verbos")
    suspend fun GetVerbos(): Response<List<VerboDto>>

}