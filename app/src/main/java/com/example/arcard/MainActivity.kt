package com.example.arcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a= Intent(this@MainActivity, UnityPlayerActivity::class.java)
        startActivity(a)
        this.finish()
    }
}