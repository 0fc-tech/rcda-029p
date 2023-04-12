package com.example.mod4interactionvue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.mod4interactionvue.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.SnackbarLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //val textView = findViewById<TextView>(R.id.textView)
        //val button = findViewById<Button>(R.id.button)
        binding.button.setOnClickListener {
            binding.textView.text="Hello j'ai appuyé"
            Snackbar.make(it,"Hello j'ai appuyé",Snackbar.LENGTH_INDEFINITE)
                .apply {
                    setAction("Annuler"){ dismiss() }
                    show()
                }
        }
    }
}