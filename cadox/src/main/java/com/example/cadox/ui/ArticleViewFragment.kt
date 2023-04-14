package com.example.cadox.ui

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.example.cadox.R
import com.example.cadox.bo.Article
import com.example.cadox.databinding.FragmentArticleViewBinding
import com.google.android.material.snackbar.Snackbar
import java.time.Instant
import java.util.*


class ArticleViewFragment : Fragment() {
    private lateinit var binding : FragmentArticleViewBinding

    //Créé la vue à afficher dans le fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //Interprète le layout fragment_article_view et on récupère le binding
        binding = FragmentArticleViewBinding.inflate(inflater, container, false)
        //On renvoie la vue "racine" (càd tout le ConstraintLayout) qui va être affichée par le fragment
        return binding.root
    }
    private val articleSample = Article(1,
        "Des lunettes de soleil (memory)",
        "RAY-BAN RB 4259 601/19 51/20",
        85.0,
        3,
        "https://www.optical-center.fr/lunettes-de-soleil/lunettes-de-soleil-RAY-BAN-RB-4259-60119-5120-25318.html?gclid=EAIaIQobChMIitHizMWe5QIVloXVCh1X6gw_EAQYASABEgLu0PD_BwE"
    )


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.article = articleSample
        //binding.textViewDetailArticle.text = articleSample.intitule
        //binding.textViewPrix.text = "${articleSample.prix}€"
        //binding.textViewUrl.text = articleSample.url
        //binding.textViewRef.text = articleSample.description
        //binding.ratingBar.rating = articleSample.niveau.toFloat()

        binding.imageButtonWeb.setOnClickListener {
            Snackbar.make(it, binding.textViewUrl.text, Snackbar.LENGTH_LONG).show()
        }
        binding.imageButtonEdit.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setMessage(getString(R.string.label_dialog_modify_article))
                .setPositiveButton("Oui"){ _, _ ->
                    binding.article?.let {
                        ArticleViewFragmentDirections.actionViewToEdit(it)
                            .also { findNavController().navigate(it) }
                    }

                }
                .setNegativeButton("Non"){ _, _ -> }
                .show()
        }
        binding.imageButtonSend.setOnClickListener {
            Snackbar.make(it, getString(R.string.label_envoi_sms), Snackbar.LENGTH_LONG).show()
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