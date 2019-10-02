package com.example.mykotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show()
    }

    fun countMe(view: View) {
        
        var count: Int = Integer.parseInt(textView.text.toString())
        count++

        textView.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, Integer.parseInt(textView.text.toString()))
        startActivity(randomIntent)
    }
}
