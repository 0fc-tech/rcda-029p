package com.example.mod7tplaunchdice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LaunchDiceViewModel : ViewModel() {
    val diceValue = MutableLiveData(0)

    fun launchDice(maxDice : Int){
        diceValue.value = (1..maxDice).random()
    }
}