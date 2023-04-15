package com.hzinho.android_pokedex.domain

data class Pokemon(
    val imageUrl: String,
    val number: Int,
    val name: String,
    val types: List<PokemonType>
) {
    val formattedNumber = number.toString().padStart(4, '0')
}

