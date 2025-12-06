package com.example.ungman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }
    fun Navigate(view: View){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
        finish()
    }
}