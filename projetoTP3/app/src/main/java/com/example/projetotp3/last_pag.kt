package com.example.projetotp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetotp3.databinding.ActivityMainBinding
import com.example.projetotp3.model.respostas



class last_pag : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    var respotas = respostas()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_pag)

        println("emcima da lista")
        println(respotas.resposta)
    }
}