package com.example.lsm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lsm.databinding.FragmentSignUpBinding

class SignUp: Fragment() {

    lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSignUpBinding.inflate(inflater, container, false)

        binding.apply {
            buttonContinue.setOnClickListener {
                val action = SignUpDirections.actionSignUpToAuthentication()
                findNavController().navigate(action)
            }
        }

        return binding.root
    }

}