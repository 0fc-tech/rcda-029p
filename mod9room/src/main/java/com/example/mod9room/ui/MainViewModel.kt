package com.example.mod9room.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.mod9room.bo.Otter
import com.example.mod9room.dao.OtterDao
import com.example.mod9room.dao.OtterDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val dao: OtterDao): ViewModel() {
    lateinit var listOtter :List<Otter>
    init {
        viewModelScope.launch {
            listOtter = dao.getAll()
        }
    }
    fun addOtter(otter : Otter){
        viewModelScope.launch {
            dao.add(otter)

        }
    }
    companion object {
        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                // Get the Application object from extras
                val application = checkNotNull(extras[APPLICATION_KEY])

                return MainViewModel(
                    OtterDatabase.getInstance(application.applicationContext).otterDao()
                ) as T
            }
        }
    }

}
