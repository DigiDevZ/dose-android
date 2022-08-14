package com.waseefakhtar.doseapp.feature.addmedication.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.waseefakhtar.doseapp.util.Recurrence
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MedicationAddViewModel @Inject constructor() : ViewModel() {

    var state by mutableStateOf(MedicationAddState())
        private set

    fun updateMedicationName(input: String) {
        state = state.copy(medicationName = input)
    }

    fun updateNumberOfDosage(input: Int) {
        state = state.copy(numberOfDosage = input)
    }

    fun updateRecurrence(recurrence: Recurrence) {
        state = state.copy(recurrence = recurrence)
    }

    fun updateEndDate(input: Long) {
        state = state.copy(endDate = input)
    }

    fun updateTimeOfDaySelected() {
        //TODO: Update and flesh out this method
        state = state.copy(timeOfDaySelectedState = state.timeOfDaySelectedState.copy())
    }

}