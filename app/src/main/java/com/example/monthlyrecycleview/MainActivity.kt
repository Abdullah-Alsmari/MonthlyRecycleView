package com.example.monthlyrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.monthlyrecycleview.data.Datasourc
import com.example.monthlyrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Initialize data.
        val myDataset = Datasourc().loadMonth()

        val recyclerView = findViewById<RecyclerView>(R.id.main)
       recyclerView.adapter = ItemAdapter(this, myDataset)


        recyclerView.setHasFixedSize(true)

    }
}

