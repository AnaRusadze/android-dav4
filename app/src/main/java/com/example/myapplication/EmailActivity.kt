package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EmailActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        emailEditText = findViewById(R.id.emailEditText)
        finishButton = findViewById(R.id.finishButton)

        val name = intent.extras?.getString("NAME")
        val age =  intent.extras?.getString("AGE")

        finishButton.setOnClickListener {
            val emailText: String = emailEditText.text.toString()
            if (emailText.isEmpty())
                return@setOnClickListener
            val email: String = emailText
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("NAME",name).putExtra("AGE",age).putExtra("EMAIL",email)
            startActivity(intent)

        }
    }
}