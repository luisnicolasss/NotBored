package com.example.notbored

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.notbored.databinding.ActListItemBinding

class ActAdapter : ListAdapter<Activities, ActAdapter.ActViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<Activities>() {
        override fun areItemsTheSame(oldItem: Activities, newItem: Activities): Boolean {
            return oldItem.activityName == newItem.activityName
        }

        override fun areContentsTheSame(oldItem: Activities, newItem: Activities): Boolean {
            return oldItem == newItem
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActAdapter.ActViewHolder {
        val binding = ActListItemBinding.inflate(LayoutInflater.from(parent.context))
        return ActViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ActAdapter.ActViewHolder, position: Int) {
         val activities = getItem(position)
        holder.bind(activities)
    }


    inner class ActViewHolder(private val binding: ActListItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(activities: Activities){
         binding.actText.text = activities.category
        }
    }
}