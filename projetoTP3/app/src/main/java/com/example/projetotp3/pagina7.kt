package com.example.projetotp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.projetotp3.model.respostas

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [pagina7.newInstance] factory method to
 * create an instance of this fragment.
 */
class pagina7 : Fragment() {

    var respotas = respostas()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pagina7, container, false)
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
            findNavController().navigate(R.id.action_pagina7_to_pagina8, null)

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