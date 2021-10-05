package com.example.notbored

import android.R.attr
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.klinker.android.link_builder.Link
import android.text.Editable

import android.R.attr.button
import android.R.attr.inputType
import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val terms = findViewById<TextView>(R.id.terms_and_Conditions)
     val startBtn = findViewById<Button>(R.id.button)
     val participants = findViewById<TextInputEditText>(R.id.participants)

        terms.setOnClickListener {

          val intent = Intent(this, TermsAndConditions::class.java)
            startActivity(intent)
        }

        participants.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

                if (participants.text.toString() > 0.toString()) {
                    startBtn.setEnabled(true)
                } else {
                    startBtn.setEnabled(false)
                }
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {

            }

            override fun afterTextChanged(s: Editable) {

            }
        })

        startBtn.setOnClickListener {
            val intent = Intent(this, ActivitiesView::class.java)
            startActivity(intent)
        }




    }


    }




