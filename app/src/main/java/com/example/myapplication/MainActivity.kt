package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle", "calling on start")

    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "calling on pause")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "calling on restart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "calling on resume")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "calling on destroy")

    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "calling on stop")

    }
}