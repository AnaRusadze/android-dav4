package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AgeActivity : AppCompatActivity() {
    private lateinit var ageEditText: EditText
    private lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)

        ageEditText = findViewById(R.id.ageEditText)
        nextButton = findViewById(R.id.nextButton)
        val name = intent.extras?.getString("NAME")
        nextButton.setOnClickListener {
            val ageText: String = ageEditText.text.toString()
            if (ageText.isEmpty())
                return@setOnClickListener
            val age: Int = ageText.toInt()
            val intent = Intent(this, EmailActivity::class.java)
            intent.putExtra("NAME",name).putExtra("AGE",age)
            startActivity(intent)

        }



    }
}