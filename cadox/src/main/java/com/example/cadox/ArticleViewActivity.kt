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
import androidx.databinding.DataBindingUtil
import com.example.cadox.bo.Article
import com.example.cadox.databinding.ActivityArticleViewBinding
import com.google.android.material.snackbar.Snackbar
import java.time.Instant
import java.time.LocalDate
import java.util.*

class ArticleViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityArticleViewBinding
    private val articleSample = Article(1,
    "Des lunettes de soleil (memory)",
    "RAY-BAN RB 4259 601/19 51/20",
    85.0,
    3,
    "https://www.optical-center.fr/lunettes-de-soleil/lunettes-de-soleil-RAY-BAN-RB-4259-60119-5120-25318.html?gclid=EAIaIQobChMIitHizMWe5QIVloXVCh1X6gw_EAQYASABEgLu0PD_BwE")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_article_view)
        binding.article = articleSample
        //binding.textViewDetailArticle.text = articleSample.intitule
        //binding.textViewPrix.text = "${articleSample.prix}€"
        //binding.textViewUrl.text = articleSample.url
        //binding.textViewRef.text = articleSample.description
        //binding.ratingBar.rating = articleSample.niveau.toFloat()

        binding.imageButtonWeb.setOnClickListener {
            Snackbar.make(it, binding.textViewUrl.text,Snackbar.LENGTH_LONG).show()
        }
        binding.imageButtonEdit.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage(getString(R.string.label_dialog_modify_article))
                .setPositiveButton("Oui"){ _, _ -> }
                .setNegativeButton("Non"){ _, _ -> }
                .show()
        }
        binding.imageButtonSend.setOnClickListener {
            Snackbar.make(it, getString(R.string.label_envoi_sms),Snackbar.LENGTH_LONG).show()
        }

        binding.checkBox.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                binding.textViewDate.visibility = View.VISIBLE
                binding.textViewDate.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
                    Date.from(Instant.now()).toString()
                else
                    Calendar.getInstance().time.toString()
            }else{
                binding.textViewDate.visibility = View.INVISIBLE
            }
        }
    }
}