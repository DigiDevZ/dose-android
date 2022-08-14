package com.waseefakhtar.doseapp.feature.medicationconfirm.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MedicationConfirmViewModel @Inject constructor() : ViewModel() {

    var state by mutableStateOf(MedicationConfirmState())
        private set

    fun confirmMedication() {
//        val newMedication = state.medication
        //TODO: Set new medication to DB
    }
}