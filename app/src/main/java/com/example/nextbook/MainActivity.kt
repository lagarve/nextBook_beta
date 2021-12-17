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

        /*TextView*/
        val infoTextView        : TextView = findViewById(R.id.info_text_view)
        /*Edit text*/
        val titleBookEditText   : EditText = findViewById(R.id.title_edit_text)
        val authorBookEditText  : EditText = findViewById(R.id.author_tedit_text)
        val pagesBookEditText   : EditText = findViewById(R.id.pages_edit_text)
        val resumenBookEditText : EditText = findViewById(R.id.resumen_edit_text)
        /*Button*/
        val saveButton : Button = findViewById(R.id.save_button)

        saveButton.setOnClickListener{
            val titleBook : String = titleBookEditText.text.toString()
            val authorBook : String = authorBookEditText.text.toString()
            val pagesBook : String = pagesBookEditText.text.toString()
            val resumenBook : String = resumenBookEditText.text.toString()

            infoTextView.text = "Titulo: $titleBook\nAutor: $authorBook\nPaginas: $pagesBook\nResumen: $resumenBook"
        }
    }
}