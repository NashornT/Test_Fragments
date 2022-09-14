package com.example.projetotp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.projetotp3.model.opcoes

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class pagina5 : Fragment() {
    var respotas = opcoes()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pagina5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var resp = -1
        val button = view.findViewById<Button>(R.id.btn_next)
        var list_agr : MutableList<Int> = mutableListOf(0)
        var agr = 0

        button.isEnabled = false

        val btn1 = view.findViewById<Button>(R.id.perg1)
        val btn2 = view.findViewById<Button>(R.id.perg2)
        val btn3 = view.findViewById<Button>(R.id.perg3)


        btn1?.setOnClickListener {
            resp = 1
            agr = 0
            list_agr.add(agr)
            verificabtn(resp,button)
        }
        btn2?.setOnClickListener {
            resp =1
            agr = 2
            list_agr.add(agr)
            verificabtn(resp,button)
        }
        btn3?.setOnClickListener {
            resp = 1
            agr = 4
            list_agr.add(agr)
            verificabtn(resp,button)

        }



        button?.setOnClickListener {

            val agrRec = requireArguments().getInt("agr4")

            val ultimo = (list_agr.last() + agrRec)
            println(ultimo)

            findNavController().navigate(R.id.action_pagina5_to_pagina6, Bundle().apply {
                putInt("agr5",ultimo)
            })



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