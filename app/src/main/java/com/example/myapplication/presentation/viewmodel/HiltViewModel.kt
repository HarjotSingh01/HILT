package com.example.myapplication.presentation.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.data.repo.TextChangeRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Harjot Singh on 18/04/23
 */
@HiltViewModel
internal class HiltViewModel @Inject constructor(
    private val repo: TextChangeRepo
) : ViewModel() {
    val getDifferentText: MutableState<String> = mutableStateOf("")

    fun getDifferentText() {
        getDifferentText.value = repo.getDifferentText()
    }
    fun getOldText() {
        getDifferentText.value = repo.getOldText()
    }
}