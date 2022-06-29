package com.example.anywhere.repository

import com.example.anywhere.model.entity.Character
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun fetchCharacters(): Flow<Character>
}