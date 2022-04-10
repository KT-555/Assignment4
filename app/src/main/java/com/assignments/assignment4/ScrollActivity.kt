package com.assignments.assignment4


import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ScrollActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        var postal = findViewById<EditText>(R.id.postalCode)
        var firstName = findViewById<EditText>(R.id.firstName)
        var lastName = findViewById<EditText>(R.id.lastName)
        var phone = findViewById<EditText>(R.id.phone)
        var email = findViewById<EditText>(R.id.email)
        var streetAddress = findViewById<EditText>(R.id.streetAddress)
        var dwellingInfo = findViewById<EditText>(R.id.dwellingInfo)
        var yearsOne = findViewById<EditText>(R.id.yearOne)
        var yearsTwo = findViewById<EditText>(R.id.years2)
        var dollarAmount = findViewById<EditText>(R.id.dollarAmount)
        var yearsThree = findViewById<EditText>(R.id.year3)
        var yearsFour = findViewById<EditText>(R.id.year4)
        var yearsBuilt = findViewById<EditText>(R.id.yearBuilt)

        fun validationCheck(): Boolean {

            if (postal.length() == 0) {
                postal.setError("This field is required")
                return false
            }
            if (firstName.length() == 0) {
                firstName.setError("This field is required")
                return false

            }
            if (lastName.length() == 0) {
                lastName.setError("This field is required")
                return false
            }
            if (phone.length() <7) {
                phone.setError("This field is required and must be 7 digits")
                return false
            }
            if (email.length() == 4){
                email.setError("This field is required")
                return false
            }
            if (streetAddress.length() == 0) {
                streetAddress.setError("This field is required")
                return false

            }
            if (dwellingInfo.length() == 0) {
                dwellingInfo.setError("This field is required")
                return false
            }
            if (yearsOne.length() == 0) {
                yearsOne.setError("This field is required")
                return false
            }
            if (yearsTwo.length() == 0) {
                yearsTwo.setError("This field is required")
                return false
            }
            if (yearsThree.length() == 0) {
                yearsThree.setError("This field is required")
                return false
            }
            if (yearsFour.length() == 0) {
                yearsFour.setError("This field is required")
                return false
            }
            if (yearsBuilt.length() == 0) {
                yearsBuilt.setError("This field is required")
                return false
            }
            if (dollarAmount.length() == 0) {
                dollarAmount.setError("This field is required")
                return false
            }

            return true
        }



        val buttonClickSub = findViewById<Button>(R.id.submitButton1)
        buttonClickSub.setOnClickListener {
            val intent = Intent(this, SubmissionActivity::class.java)
            if (validationCheck() == true) {
                startActivity(intent)

            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle(R.string.dialogTitle)
                builder.setMessage(R.string.dialogMessage)
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            }
        }
    }
}