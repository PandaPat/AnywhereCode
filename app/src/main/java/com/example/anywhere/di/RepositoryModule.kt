package com.example.anywhere.di

import com.example.anywhere.api.CharacterRemoteSource
import com.example.anywhere.repository.CharacterRepository
import com.example.anywhere.repository.CharacterRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideCharacterRepository(
        characterRemoteSource: CharacterRemoteSource,
    ): CharacterRepository {
        return CharacterRepositoryImpl(characterRemoteSource)
    }
}