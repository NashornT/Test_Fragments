package com.example.projetotp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [paginaResultado.newInstance] factory method to
 * create an instance of this fragment.
 */
class paginaResultado : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pagina_resultado, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txtResultado = view.findViewById<TextView>(R.id.txtResult)
        val resultado = requireArguments().getInt("resultado")
        val button = view.findViewById<Button>(R.id.btn_Sobre)

        if(resultado <= 14){
            txtResultado.setText("O seu perfil é Conservador")
        }else if(resultado >= 15 && resultado < 35){
            txtResultado.setText("O seu perfil é Moderado")
        }else if (resultado > 36){
            txtResultado.setText("O seu perfil é Arrojado")
        }

        button.setOnClickListener {
            findNavController().navigate(R.id.action_paginaResultado_to_last_pag,null)
        }

        println("valor final $resultado")




    }


}