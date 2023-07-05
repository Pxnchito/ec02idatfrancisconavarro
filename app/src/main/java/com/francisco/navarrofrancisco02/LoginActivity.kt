package com.francisco.navarrofrancisco02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.francisco.navarrofrancisco02.databinding.ActivityLoginBinding
import com.francisco.navarrofrancisco02.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private var isEmailOk: Boolean=false
    private var isPasswordOk: Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViews()
    }

    private fun setupViews(){
        binding.txtCorreo.editText?.addTextChangedListener{text ->
            binding.btnIniciar.isEnabled = validateInputs(text.toString(), binding.txtPass.editText?.text.toString())
        }
        binding.txtPass.editText?.addTextChangedListener { text ->
            binding.btnIniciar.isEnabled = validateInputs(binding.txtCorreo.editText?.text.toString(), text.toString())
        }
        binding.btnIniciar.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
            val email = binding.txtCorreo.editText?.text.toString()
            val password = binding.txtPass.editText?.text.toString()
            if (email == "ejemplo@idat.edu.pe" && password == "123456")
                Toast.makeText(this,"Inicio de sesión correcto", Toast.LENGTH_SHORT).show()
            else{
                Toast.makeText(this, "INCORRECTO", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validateInputs(email:String , password:String): Boolean{
        val isEmailOk = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val isPasswordOk = password.length >= 6
        return isPasswordOk && isEmailOk
    }
}