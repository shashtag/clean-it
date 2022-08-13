package com.example.lsm.BottomNavFragments

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lsm.Adapters.GarbageAdapter
import com.example.lsm.Models.GarbageModel
import com.example.lsm.R
import com.example.lsm.databinding.FragmentHomeFragmentBinding

class HomeFragment: Fragment() {

    lateinit var list: ArrayList<GarbageModel>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentHomeFragmentBinding =
            FragmentHomeFragmentBinding.inflate(inflater, container, false)

        list = ArrayList<GarbageModel>()
        list.add(GarbageModel(R.drawable.garbage_img, "Landmark", "Remark"))
        list.add(GarbageModel(R.drawable.garbage_img, "Landmark", "Remark"))
        list.add(GarbageModel(R.drawable.garbage_img, "Landmark", "Remark"))
        binding.apply {
            val adapter = GarbageAdapter(list, context as Activity)
            garbageRecyclerview.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            garbageRecyclerview.adapter = adapter
        }

        return binding.root
    }
}