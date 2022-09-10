package com.example.projetotp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetotp3.databinding.ActivityFormBinding
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions


class form : AppCompatActivity() {
    private  lateinit var binding: ActivityFormBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }


    /*
    private fun setupClick(){
        /*pode quebrar atenção */
        binding.btnFrag.setOnClickListener{
            cont =+ 1
        }
    }
    private fun fragView(){
        if (cont == 1){
            val firstFragment = FragmentOne ()

        }
    }*/
}


