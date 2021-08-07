package com.cappandatiga.aplikasikkn.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cappandatiga.aplikasikkn.databinding.ActivityPageFiveBinding

class PageFiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPageFiveBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}