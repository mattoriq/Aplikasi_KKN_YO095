package com.cappandatiga.aplikasikkn.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cappandatiga.aplikasikkn.databinding.ActivityPageFiveBinding
import com.cappandatiga.aplikasikkn.databinding.ActivityPageSixBinding

class PageSixActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPageSixBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}