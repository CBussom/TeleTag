package com.plcoding.bluetoothchat.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor() : ViewModel() {
    // Your ViewModel logic goes here

    // Function to handle the "Back" button click
    fun onBackButtonClick() {
        // Add your logic here
        // For example, you can navigate back to a previous screen
    }
}
