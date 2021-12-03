package com.example.storeonlinehw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

import com.example.storeonlinehw.data.DataSorce
import com.example.storeonlinehw.databinding.ActivityMainBinding
import com.example.storeonlinehw.productAdapter.BuyButton
import com.example.storeonlinehw.productAdapter.ItemAdapter

class MainActivity : AppCompatActivity() {

lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
       setContentView(binding.root)
        val dataSet = DataSorce().loadPhone()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, dataSet)
        recyclerView.setHasFixedSize(true)





//binding.root.getViewById(R.id.buy_button)

//        val intent:Intent =Intent(applicationContext,MainActivity2::class.java)
//        startActivity(intent)
//       btn =findViewById(R.id.buy_button)
//        btn.setOnClickListener {
//val intent:Intent =Intent(applicationContext,MainActivity2::class.java)
//            startActivity(intent)
//}
        }

    }

