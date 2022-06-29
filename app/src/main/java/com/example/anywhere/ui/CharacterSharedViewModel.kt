package com.example.anywhere.ui

import androidx.lifecycle.viewModelScope
import com.example.anywhere.base.BaseViewModel
import com.example.anywhere.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterSharedViewModel @Inject constructor(
    private val characterRepository: CharacterRepository,
) : BaseViewModel() {


    private fun refreshData() {
        viewModelScope.launch {

        }
    }
}