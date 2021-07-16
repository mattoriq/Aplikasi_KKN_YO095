

package com.cappandatiga.aplikasikkn.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cappandatiga.aplikasikkn.R
import com.cappandatiga.aplikasikkn.databinding.ActivityMainBinding
import com.cappandatiga.aplikasikkn.pages.PageFourActivity
import com.cappandatiga.aplikasikkn.pages.PageOneActivity
import com.cappandatiga.aplikasikkn.pages.PageThreeActivity
import com.cappandatiga.aplikasikkn.pages.PageTwoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            content1.title.text = getString(R.string.title_1)
            content2.title.text = getString(R.string.title_2)
            content3.title.text = getString(R.string.title_3)
            content4.title.text = getString(R.string.title_4)
//            content1.thumbnail.setImageDrawable(R.drawable.mountain)
            content1.cardView.setOnClickListener {
                val intent = Intent(this@MainActivity, PageOneActivity::class.java)
                startActivity(intent)
            }
            content2.cardView.setOnClickListener {
                val intent = Intent(this@MainActivity, PageTwoActivity::class.java)
                startActivity(intent)
            }
            content3.cardView.setOnClickListener {
                val intent = Intent(this@MainActivity, PageThreeActivity::class.java)
                startActivity(intent)
            }
            content4.cardView.setOnClickListener {
                val intent = Intent(this@MainActivity, PageFourActivity::class.java)
                startActivity(intent)
            }
        }
    }
}