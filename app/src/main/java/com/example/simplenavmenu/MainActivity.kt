package com.example.simplenavmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<BottomNavigationView>(R.id.navMenu).setOnNavigationItemSelectedListener { item ->
            navClick(item)
        }


    }

    private fun navClick(it: MenuItem): Boolean {
        when (it.itemId) {
            R.id.first -> {
                val s = "First"
                findViewById<TextView>(R.id.textView).text = s
                true
            }

            R.id.second -> {
                val s = "Second"
                findViewById<TextView>(R.id.textView).text = s
                true
            }
            R.id.third -> {
                val s = "Third"
                findViewById<TextView>(R.id.textView).text = s
                true
            }
            else -> false
        }
        return false
    }
}