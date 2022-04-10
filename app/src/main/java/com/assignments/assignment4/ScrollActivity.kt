package com.assignments.assignment4

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.InputFilter
import android.text.Spanned
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Matcher
import java.util.regex.Pattern


class ScrollActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        val buttonClickSub = findViewById<Button>(R.id.submitButton1)
        buttonClickSub.setOnClickListener {
            val intent = Intent(this, SubmissionActivity::class.java)
            startActivity(intent)
        }

    }

}