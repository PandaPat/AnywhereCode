package com.example.anywhere.extensions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

object ViewExtension {
    fun <T : ViewDataBinding> ViewGroup.binding(
        @LayoutRes layoutRes: Int,
        attachToParent: Boolean = false
    ): T {
        return DataBindingUtil.inflate(
            LayoutInflater.from(context),
            layoutRes,
            this,
            attachToParent
        )
    }
}