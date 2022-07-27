package com.example.groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.groceryapp.databinding.ActivityMainBinding
import com.example.groceryapp.databinding.ActivityOrder2Binding

class OrderActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityOrder2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOrder2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNt.setOnClickListener {
            val intent= Intent(this,PriceActivity::class.java)
            startActivity(intent)
        }
    }
}