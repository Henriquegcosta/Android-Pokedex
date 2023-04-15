package com.hzinho.android_pokedex.api

import com.hzinho.android_pokedex.api.model.PokemonApiResult
import retrofit2.Call
import com.hzinho.android_pokedex.api.model.PokemonsApiResult
import retrofit2.http.GET
import retrofit2.http.Query


interface PokemonService {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<PokemonsApiResult>

    @GET("pokemon/{number}")
    fun getPokemon(number: Int): Call<PokemonApiResult>
}