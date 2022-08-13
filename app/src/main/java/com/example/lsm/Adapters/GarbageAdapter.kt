package com.example.lsm.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lsm.Models.GarbageModel
import com.example.lsm.R
import com.example.lsm.databinding.GarbageCardViewBinding

class GarbageAdapter(val list: ArrayList<GarbageModel>, val context: Context): RecyclerView.Adapter<GarbageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GarbageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: GarbageCardViewBinding =
            GarbageCardViewBinding.inflate(inflater, parent, false)
        return GarbageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GarbageViewHolder, position: Int) {
        holder.imageview.setImageResource(list.get(position).image)
        holder.landmark.setText(list.get(position).landmark)
        holder.remark.setText(list.get(position).remarks)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class GarbageViewHolder(binding: GarbageCardViewBinding): RecyclerView.ViewHolder(binding.root) {

    var imageview: ImageView
    var landmark: TextView
    var remark: TextView
    init {
        imageview = binding.imageView
        landmark = binding.landmark
        remark = binding.remarks
    }
}