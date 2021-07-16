package com.cappandatiga.aplikasikkn.pages

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cappandatiga.aplikasikkn.R
import com.cappandatiga.aplikasikkn.databinding.ActivityPageOneBinding

class PageOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPageOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.title_1)
        }
        with(binding){
            title.text = getString(R.string.title_1)
            collapsingBar.setCollapsedTitleTextColor(Color.rgb(255,255,255))
            collapsingBar.setExpandedTitleColor(Color.TRANSPARENT)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}