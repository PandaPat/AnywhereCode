package com.example.anywhere.repository

import com.example.anywhere.api.CharacterApiResponse
import com.example.anywhere.api.CharacterRemoteSource
import com.example.anywhere.model.entity.Character
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val characterRemoteSource: CharacterRemoteSource
) : CharacterRepository {

    override fun fetchCharacters() = flow {
        var responseViewData: CharacterApiResponse?
        characterRemoteSource.fetchCharacters().run {
            responseViewData = this
        }
        emit(responseViewData as Character)
    }.flowOn(Dispatchers.IO)

}