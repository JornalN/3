package com.example.a3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var imageButton: ImageButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        imageButton = findViewById(R.id.imageButton)
        editText = findViewById(R.id.editTextText1)
        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Hello, friend"
            } else {
                textView.text = "Hello, ${editText.text}"
            }
        }
    }
}