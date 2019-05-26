package com.example.game_guide

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.Game_Guide.MESSAGE"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val overviewText = findViewById<TextView>(R.id.overviewText)
        val message = textView.text.toString()
        val intent  = Intent(this, OverviewActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
    fun openChar(view: View){
        val intent = Intent(this, CharacterActivity::class.java)
        startActivity(intent)
    }

    fun openTerms(view: View){
        val intent = Intent(this, TermsActivity::class.java)
        startActivity(intent)
    }
}
