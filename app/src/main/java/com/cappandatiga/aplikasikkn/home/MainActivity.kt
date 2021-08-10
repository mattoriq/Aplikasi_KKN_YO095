package com.cappandatiga.aplikasikkn.home

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import com.cappandatiga.aplikasikkn.R
import com.cappandatiga.aplikasikkn.about.AboutActivity
import com.cappandatiga.aplikasikkn.databinding.ActivityMainBinding
import com.cappandatiga.aplikasikkn.pages.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val colorDrawable = ColorDrawable(Color.parseColor("#66bb6a"))
        supportActionBar?.setBackgroundDrawable(colorDrawable)

        with(binding){
            root.setBackgroundColor(Color.WHITE)
            content1.title.text = getString(R.string.title_1)
            content2.title.text = getString(R.string.title_2)
            content3.title.text = getString(R.string.title_3)
            content4.title.text = getString(R.string.title_4)
            content5.title.text = getString(R.string.title_5)
            content6.title.text = getString(R.string.title_6)
            content1.thumbnail.setImageResource(R.drawable.thumb1)
            content2.thumbnail.setImageResource(R.drawable.thumb2)
            content3.thumbnail.setImageResource(R.drawable.thumb3)
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
            content5.cardView.setOnClickListener {
                val intent = Intent(this@MainActivity, PageFiveActivity::class.java)
                startActivity(intent)
            }
            content6.cardView.setOnClickListener {
                val intent = Intent(this@MainActivity, PageSixActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.show_about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}