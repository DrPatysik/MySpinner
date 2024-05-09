package com.example.myspinner

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var spinner: Spinner? = null
    private var textField: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        textField = findViewById(R.id.text1)

        val button1: Button = findViewById(R.id.button2)
        button1.setOnClickListener {
            val spinnerPosition = spinner?.selectedItemPosition
            textField?.text = showDescription(spinnerPosition!!)
        }
    }

    private fun showDescription(index: Int): String {
        val descriptionArray = getResources().getStringArray(R.array.descriptionOfEye)
        return descriptionArray[index]
    }

}