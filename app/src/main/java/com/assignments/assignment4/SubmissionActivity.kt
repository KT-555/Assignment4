package com.assignments.assignment4

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class SubmissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submission1)


        //Create email using intents
        val buttonClickSub2 = findViewById<Button>(R.id.submitButton2)
        buttonClickSub2.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND);
            intent.setType("message/html");
            intent.putExtra(Intent.EXTRA_EMAIL  , ("junk277@outlook.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Your MUNN Insurance Quote!");
            intent.putExtra(Intent.EXTRA_TEXT, "Please call 1-844-554-0525 and reference quote xxxxxx");
            try {
                startActivity(Intent.createChooser(intent, "Send email..."))
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(
                    this@SubmissionActivity,
                    "No email client available.",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }
}