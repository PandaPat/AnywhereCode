package com.example.anywhere.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.anywhere.R
import com.example.anywhere.databinding.ItemCharacterBinding
import com.example.anywhere.extensions.ViewExtension.binding
import com.example.anywhere.model.entity.Character

class CharacterListAdapter :
    RecyclerView.Adapter<CharacterListAdapter.CharacterListViewHolder>() {

    private var items: MutableList<Character> = arrayListOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharacterListViewHolder {
        val binding = parent.binding<ItemCharacterBinding>(R.layout.item_character)
        return CharacterListViewHolder(binding).apply {
        }
    }

    override fun onBindViewHolder(
        holder: CharacterListViewHolder,
        position: Int
    ) {
        with(holder.binding) {
            character = items[position]
            lifecycleOwner = holder.binding.lifecycleOwner
            executePendingBindings()
        }
    }

    override fun getItemCount() = items.size

    inner class CharacterListViewHolder(val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root)
}