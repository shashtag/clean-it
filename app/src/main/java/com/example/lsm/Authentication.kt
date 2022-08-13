package com.example.lsm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lsm.databinding.FragmentAuthenticationBinding

class Authentication: Fragment() {

    lateinit var binding: FragmentAuthenticationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentAuthenticationBinding.inflate(inflater, container, false)

        binding.apply {
            buttonContinue.setOnClickListener {
                val action = AuthenticationDirections.actionAuthenticationToVerification2()
                findNavController().navigate(action)
            }
        }

        return binding.root
    }
}