package com.example.nextbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val infoTextView : TextView = findViewById(R.id.info_text_view)
        val titleBookEditText : EditText = findViewById(R.id.title_edit_text)
        val saveButton : Button = findViewById(R.id.save_button)

        saveButton.setOnClickListener{
            val titleBook : String = titleBookEditText.text.toString()
            infoTextView.text = titleBook
        }
    }
}