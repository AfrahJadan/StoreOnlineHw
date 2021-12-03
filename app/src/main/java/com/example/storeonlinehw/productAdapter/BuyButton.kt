package com.example.storeonlinehw.productAdapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.storeonlinehw.MainActivity
import com.example.storeonlinehw.databinding.ActivityMainBinding

class BuyButton: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}

