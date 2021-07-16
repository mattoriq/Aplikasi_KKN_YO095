package com.cappandatiga.aplikasikkn.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cappandatiga.aplikasikkn.R
import com.cappandatiga.aplikasikkn.databinding.ActivityPageTwoBinding

class PageTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPageTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.title_2)
        }
        with(binding){
            title.text = getString(R.string.title_2)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}