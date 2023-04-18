package com.example.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10recyclerview.bo.Tuning
import com.example.mod10recyclerview.databinding.TemplateTuningBinding

class TuningAdapter(val arrayList: ArrayList<Tuning>) : RecyclerView.Adapter<TuningAdapter.TuningVH>() {
    class TuningVH(val binding: TemplateTuningBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TuningVH {
        val binding = TemplateTuningBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        )
        return TuningVH(binding)
    }

    override fun onBindViewHolder(holder: TuningVH, position: Int) {
        holder.binding.tuning = arrayList[position]
    }

    override fun getItemCount(): Int = arrayList.size
}