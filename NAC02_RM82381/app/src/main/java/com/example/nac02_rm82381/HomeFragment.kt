package com.example.nac02_rm82381

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.nac02_rm82381.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var bindings: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindings.next.setOnClickListener {
            val num1 = Integer.parseInt(bindings.numero1.text.toString())
            val num2 = Integer.parseInt(bindings.numero2.text.toString())
            val resultado = (num1 + num2)

            val action = HomeFragmentDirections.actionHomeFragmentToResultFragment(resultado)
            findNavController().navigate(action)
        }
    }
}