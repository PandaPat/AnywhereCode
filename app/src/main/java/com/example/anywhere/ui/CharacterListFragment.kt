package com.example.anywhere.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.anywhere.ui.adapter.CharacterListAdapter
import com.example.anywhere.R
import com.example.anywhere.api.CharacterRemoteSource
import com.example.anywhere.base.ViewBindingFragment
import com.example.anywhere.databinding.MainFragmentCharacterBinding
import javax.inject.Inject

class CharacterListFragment @Inject constructor(
    private val characterRemoteSource: CharacterRemoteSource
):
    ViewBindingFragment<MainFragmentCharacterBinding>(R.layout.main_fragment_character) {

    private val viewModel: CharacterSharedViewModel by viewModels()

    override val bindingComponent: (LayoutInflater, ViewGroup?, Boolean) -> MainFragmentCharacterBinding
        get() = MainFragmentCharacterBinding::inflate

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding {
            adapter = CharacterListAdapter()
        }.root
    }
}