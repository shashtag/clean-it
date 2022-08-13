package com.example.lsm

import android.R
import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lsm.databinding.FragmentHomeScreenBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.Exception


class HomeScreen: Fragment() {

    lateinit var binding: FragmentHomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeScreenBinding.inflate(inflater, container, false)

        binding.apply {
            try {
                val navHostFragment =
                    childFragmentManager?.findFragmentById(frameLayout.id) as NavHostFragment
                    val navController = navHostFragment.navController
                    val appBarConfiguration = AppBarConfiguration(navController.graph)
                    bottomNavigation.setupWithNavController(navController)
            } catch (e: Exception) {
                Log.i("MADARCHOD", "" + e.message)
                Toast.makeText(context, "" + e.message, Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }
}