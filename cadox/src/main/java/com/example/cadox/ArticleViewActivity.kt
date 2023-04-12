package com.example.cadox

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import java.time.Instant
import java.time.LocalDate
import java.util.*

class ArticleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_view)
        val textViewUrl = findViewById<TextView>(R.id.textViewUrl)
        val textViewDate = findViewById<TextView>(R.id.textViewDate)
        val imageButtonWeb = findViewById<ImageButton>(R.id.imageButtonWeb)
        val imageButtonEdit = findViewById<ImageButton>(R.id.imageButtonEdit)
        val imageButtonSend = findViewById<ImageButton>(R.id.imageButtonSend)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        imageButtonWeb.setOnClickListener {
            Snackbar.make(it, textViewUrl.text,Snackbar.LENGTH_LONG).show()
        }
        imageButtonEdit.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage(getString(R.string.label_dialog_modify_article))
                .setPositiveButton("Oui"){ _, _ -> }
                .setNegativeButton("Non"){ _, _ -> }
                .show()
        }
        imageButtonSend.setOnClickListener {
            Snackbar.make(it, getString(R.string.label_envoi_sms),Snackbar.LENGTH_LONG).show()
        }

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                textViewDate.visibility = View.VISIBLE
                textViewDate.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
                    Date.from(Instant.now()).toString()
                else
                    Calendar.getInstance().time.toString()
            }else{
                textViewDate.visibility = View.INVISIBLE
            }
        }
    }
}