package com.example.anywhere.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class ViewBindingActivity<T : ViewDataBinding> constructor(
    @LayoutRes private val layoutId: Int
) : AppCompatActivity() {

    private var bindingComponent: DataBindingComponent? = DataBindingUtil.getDefaultComponent()

    protected val binding: T by lazy(LazyThreadSafetyMode.NONE) {
        DataBindingUtil.setContentView(this, layoutId, bindingComponent)
    }

    init {
        addOnContextAvailableListener {
            binding.notifyChange()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}