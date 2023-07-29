package com.example.checkemail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.checkemail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonVerifyEmail()
    }

    private fun buttonVerifyEmail() {
        binding.buttonVerify.setOnClickListener {
            binding.editTextAddEmail.text
            val value = binding.editTextAddEmail.text
            Toast.makeText(this, value, Toast.LENGTH_LONG).show()
        }
    }
}
