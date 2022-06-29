package com.example.anywhere.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class ViewBindingFragment<T : ViewDataBinding> constructor(
    @LayoutRes private val layoutId: Int
) : Fragment() {

    private var _binding: ViewDataBinding? = null
    abstract val bindingComponent: (LayoutInflater, ViewGroup?, Boolean) -> T

    @Suppress("UNCHECKED_CAST")
    protected val binding: T
        get() = _binding as T

    protected inline fun binding(block: T.() -> Unit): T {
        return binding.apply(block)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding = DataBindingUtil.inflate(
            inflater,
            layoutId,
            container,
            false,
        )
        return requireNotNull(_binding).root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}