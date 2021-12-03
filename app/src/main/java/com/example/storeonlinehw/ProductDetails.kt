package com.example.storeonlinehw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ProductDetails : AppCompatActivity() {
    companion object{
        const val prodName = "Name"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)
        val productDetails =intent?.extras?.getString(prodName).toString()
        val text:TextView = findViewById(R.id.productDetail)
        text.text =productDetails
    }
}
//All App is Working Good BUT i cant let the Photo be Dynamic in Photo Details.