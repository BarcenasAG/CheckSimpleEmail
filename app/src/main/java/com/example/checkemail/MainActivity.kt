package com.example.checkemail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.checkemail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val  mainActivityViewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonVerifyEmail()
        initObserver()
    }

    private fun initObserver() {
        mainActivityViewModel.isValidateEmail.observe(this){isValidate ->
            if (isValidate) Toast.makeText(this, "Si es Valido", Toast.LENGTH_SHORT).show() else
                Toast.makeText(this, "No es Valido", Toast.LENGTH_SHORT).show()
        }
    }

    private fun buttonVerifyEmail() {
        binding.buttonVerify.setOnClickListener {
            mainActivityViewModel.validateEmail(binding.editTextAddEmail.text.toString())
        }
    }
}
