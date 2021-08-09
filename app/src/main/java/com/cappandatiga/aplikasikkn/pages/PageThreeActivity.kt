package com.cappandatiga.aplikasikkn.pages

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cappandatiga.aplikasikkn.R
import com.cappandatiga.aplikasikkn.databinding.ActivityPageThreeBinding

class PageThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPageThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            root.setBackgroundColor(Color.WHITE)
            title.text = getString(R.string.title_3)
            collapsingBar.setCollapsedTitleTextColor(Color.rgb(255,255,255))
            collapsingBar.setExpandedTitleColor(Color.TRANSPARENT)
            toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
            toolbar.setNavigationOnClickListener {
                onSupportNavigateUp()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}