package com.example.mod7lifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var compteur = MutableLiveData<Int>(0)
    fun incrementCounter() {
        //On affecte à notre compteur l'ancienne valeur + 1
        compteur.value = compteur.value?.plus(1)
    }
    fun decrementCounter() {
        //On affecte à notre compteur l'ancienne valeur + 1
        compteur.value = compteur.value?.minus(1)
    }

}