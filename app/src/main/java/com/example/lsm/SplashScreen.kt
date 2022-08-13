package com.example.lsm

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.window.SplashScreen
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SplashScreen: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_splash_screen, container, false)


        Handler().postDelayed({
            val action = SplashScreenDirections.actionSplashScreenToSignUp()
            findNavController().navigate(action)
        },1000)

        return view
    }
}