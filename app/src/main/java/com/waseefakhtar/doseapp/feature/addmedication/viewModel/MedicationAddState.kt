package com.waseefakhtar.doseapp.feature.addmedication.viewModel

import com.waseefakhtar.doseapp.util.Recurrence
import java.util.*

data class MedicationAddState(
    val medicationName: String = "",
    val numberOfDosage: Int = 0,
    val recurrence: Recurrence = Recurrence.Daily,
    val endDate: Long = Date().time,
    val timeOfDaySelectedState: TimeOfDaySelectedState = TimeOfDaySelectedState()
)

data class TimeOfDaySelectedState(
    val isMorningSelected: Boolean = false,
    val isAfternoonSelected: Boolean = false,
    val isEveningSelected: Boolean = false,
    val isNightSelected: Boolean = false
)