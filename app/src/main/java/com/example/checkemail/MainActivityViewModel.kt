package com.example.checkemail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    private val _isValidateEmail = MutableLiveData<Boolean>()
    val isValidateEmail: LiveData<Boolean>
        get() = _isValidateEmail

    fun validateEmail(email: String) {
        val emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$".toRegex()
        val isValidate = emailRegex.matches(email)
        _isValidateEmail.value = isValidate
    }
}
