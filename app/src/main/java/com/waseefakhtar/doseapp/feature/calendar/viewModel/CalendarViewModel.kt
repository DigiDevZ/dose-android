package com.waseefakhtar.doseapp.feature.calendar.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CalendarViewModel @Inject constructor() {

    var state by mutableStateOf(CalendarState())
        private set

    //TODO: Fill out when Calendar feature is implemented
}