package com.ezatpanah.expandable_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezatpanah.expandable_recyclerview.adapter.MainAdapter
import com.ezatpanah.expandable_recyclerview.databinding.ActivityMainBinding
import com.ezatpanah.expandable_recyclerview.model.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvParent.adapter = MainAdapter(SampleData.collections)


    }

}