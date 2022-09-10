package com.example.projetotp3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.projetotp3.model.resposta
import com.example.projetotp3.model.respostas


class BlankFragment : Fragment() {

    var respotas = respostas()
    var testes = com.example.projetotp3.model.testes()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pagina1, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var resp = -1
        val button = view.findViewById<Button>(R.id.btn_next)

        button.isEnabled = false

        val btn1 = view.findViewById<Button>(R.id.perg1)
        val btn2 = view.findViewById<Button>(R.id.perg2)
        val btn3 = view.findViewById<Button>(R.id.perg3)
        val btn4 = view.findViewById<Button>(R.id.perg4)

        btn1?.setOnClickListener {
            resp = 1
            verificabtn(resp,button)
        }
        btn2?.setOnClickListener {
            resp =1
            verificabtn(resp,button)
        }
        btn3?.setOnClickListener {
            resp = 1
            verificabtn(resp,button)

        }
        btn4?.setOnClickListener {
            resp = 1
            verificabtn(resp,button)
        }


        button?.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_pagina2, null)

        }

    }

    fun verificabtn(valor:Int,btn:Button){
        if(valor > 0){
            btn.isEnabled = true
        }else{
            btn.isEnabled = false
        }
    }


}


