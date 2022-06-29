package com.example.anywhere

import android.os.Bundle
import com.example.anywhere.base.ViewBindingActivity
import com.example.anywhere.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ViewBindingActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.app_name)
    }
}