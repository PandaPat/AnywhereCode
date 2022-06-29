package com.example.anywhere.api

import retrofit2.http.GET

interface CharacterRemoteSource {

    @GET("character")
    suspend fun fetchCharacters(): CharacterApiResponse
}