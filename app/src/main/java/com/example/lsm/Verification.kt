package com.example.lsm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lsm.databinding.FragmentVerificationBinding

class Verification: Fragment() {

    lateinit var binding: FragmentVerificationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVerificationBinding.inflate(inflater, container, false)

        binding.apply {
            buttonContinue.setOnClickListener {
                val action = VerificationDirections.actionVerification2ToHomeScreen2()
                findNavController().navigate(action)
            }
        }

        return binding.root
    }
}