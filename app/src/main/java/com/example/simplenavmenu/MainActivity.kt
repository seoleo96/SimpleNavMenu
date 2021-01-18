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
        val navMenu = findViewById<BottomNavigationView>(R.id.navMenu)
        navMenu.setOnNavigationItemSelectedListener {
           navClick(it)
        }


    }

    private fun navClick(it : MenuItem): Boolean {
        when(it.itemId){
            R.id.first -> {
                findViewById<TextView>(R.id.textView).text = "First"
                true
            }

            R.id.second -> {
                findViewById<TextView>(R.id.textView).text = "second"
                true
            }
            R.id.third ->{
                findViewById<TextView>(R.id.textView).text = "third"
                true
            }
            else -> false
        }
        return false
    }
}