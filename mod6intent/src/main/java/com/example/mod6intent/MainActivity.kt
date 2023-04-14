package com.example.mod6intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    val intentMap = Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.0389009,-1.69238"))
    val intentCall = Intent(Intent.ACTION_CALL, Uri.parse("tel:123456789"))
    val intentCallView = Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"))

    val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ){isGranted ->
        startActivity(
            if(isGranted)
                intentCall
            else intentCallView
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonConnexion).setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
        findViewById<Button>(R.id.buttonMap).setOnClickListener { startActivity(intentMap) }
        findViewById<Button>(R.id.buttonCall).setOnClickListener {
            requestPermissionLauncher.launch(android.Manifest.permission.CALL_PHONE)
        }
    }
}