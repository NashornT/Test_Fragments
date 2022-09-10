package com.example.projetotp3

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.projetotp3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    lateinit var nome: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setup()
    }

    private fun setup(){
        setupTextChange()
        setupClick()
    }

    private fun setupClick(){
        binding.button.setOnClickListener{
            abreForm()
        }
    }

    private fun abreForm(){
        startActivity(Intent(this,form::class.java))
        Toast.makeText(this,"Bem Vindo $nome",Toast.LENGTH_SHORT).show()


    }

    private fun setupTextChange() {
        binding.Login.doAfterTextChanged {

            nome = binding.Login.text.toString()
            if(it?.length!! > 5){
                binding.button.isEnabled = true
            }else{
                binding.button.isEnabled = false
            }
        }
    }
}

