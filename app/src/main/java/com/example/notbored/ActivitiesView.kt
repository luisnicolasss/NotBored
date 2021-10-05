package com.example.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notbored.databinding.ActivityActivitiesViewBinding

class ActivitiesView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         val binding = ActivityActivitiesViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.actRecycler.layoutManager = LinearLayoutManager(this)
        val actList = mutableListOf<Activities>()
        actList.add(Activities("Run park", 0.9, "3", "Education"))
        actList.add(Activities("Go shopping", 0.1, "2", "Recreational"))
        actList.add(Activities("Use Facebook", 1.2, "1", "Social"))
        actList.add(Activities("Repair the garden", 3.9, "4", "Diy"))
        actList.add(Activities("Be a voluntary", 1.8, "2", "Charity"))
        actList.add(Activities("Cook a pizza", 0.2, "4", "Cooking"))
        actList.add(Activities("Meditation", 0.5, "1", "Relaxation"))
        actList.add(Activities("Listen old Music", 1.3, "4", "Music"))
        actList.add(Activities("Find a job", 2.2, "3", "Busywork"))

        val adapter = ActAdapter()
        binding.actRecycler.adapter = adapter
        adapter.submitList(actList)
    }
    }



