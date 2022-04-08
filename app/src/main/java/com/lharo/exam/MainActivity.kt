package com.lharo.exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBoton = findViewById<Button>(R.id.button_toAct2)
        miBoton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = when(view.id) {
            R.id.button_toAct2 -> Intent(this, MoviesActivity::class.java)
            else->throw IllegalArgumentException("Invalid button")
        }
        startActivity(intent)
    }
}