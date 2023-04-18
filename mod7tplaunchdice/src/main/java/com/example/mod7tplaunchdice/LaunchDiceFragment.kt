package com.example.mod7tplaunchdice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.mod7tplaunchdice.databinding.FragmentLaunchDiceBinding


class LaunchDiceFragment : Fragment() , OnClickListener{
    lateinit var binding : FragmentLaunchDiceBinding
    val viewModel : LaunchDiceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLaunchDiceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        binding.button6.setOnClickListener { onClick(it) }
        binding.button9.setOnClickListener { onClick(it) }
        binding.button12.setOnClickListener { onClick(it) }
        binding.button16.setOnClickListener { onClick(it) }
        binding.button18.setOnClickListener { onClick(it) }
        binding.button20.setOnClickListener { onClick(it) }
    }


    override fun onClick(v: View?) {
        if(v?.tag != null)
            viewModel.launchDice(v?.tag.toString().toInt())
    }
}