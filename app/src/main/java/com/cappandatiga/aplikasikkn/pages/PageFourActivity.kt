package com.cappandatiga.aplikasikkn.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cappandatiga.aplikasikkn.R
import com.cappandatiga.aplikasikkn.databinding.ActivityPageFourBinding

class PageFourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPageFourBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.title_4)
        }
        with(binding){
            title.text = getString(R.string.title_4)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}