package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val fab = findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener {
            Log.i("FAB", "Clicked!")
            lifecycleScope.launch {
                it.isEnabled = false
                delay(2000)
                it.isEnabled = true
            }
        }
    }
}
