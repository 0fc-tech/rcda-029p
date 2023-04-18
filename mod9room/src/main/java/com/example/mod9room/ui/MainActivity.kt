package com.example.mod9room.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.mod9room.R
import com.example.mod9room.bo.Otter
import com.example.mod9room.bo.SexOtter

class MainActivity : AppCompatActivity() {
    val viewModel : MainViewModel by viewModels{MainViewModel.Factory}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.addOtter(
            Otter(0,"Sophie",
                    SexOtter.FEMALE,7,5,true,67f)
        )
        //OtterDatabase.getInstance(this).otterDao().add(
        //    Otter(0,"Sophie",
        //        SexOtter.FEMALE,7,5,true,67f)
        //)
    }
}