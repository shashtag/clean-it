package com.example.lsm.BottomNavFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lsm.databinding.FragmentAddComplaintFragmentBinding

class AddComplaintFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentAddComplaintFragmentBinding =
            FragmentAddComplaintFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }
}