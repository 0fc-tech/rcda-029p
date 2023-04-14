package com.example.cadox.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cadox.R
import com.example.cadox.bo.Article
import com.example.cadox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val articleSample = Article(1,
    "Des lunettes de soleil (memory)",
    "RAY-BAN RB 4259 601/19 51/20",
    85.0,
    3,
    "https://www.optical-center.fr/lunettes-de-soleil/lunettes-de-soleil-RAY-BAN-RB-4259-60119-5120-25318.html?gclid=EAIaIQobChMIitHizMWe5QIVloXVCh1X6gw_EAQYASABEgLu0PD_BwE")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}