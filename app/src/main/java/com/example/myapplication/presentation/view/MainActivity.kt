package com.example.myapplication.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.presentation.theme.MyComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                ShowUi()
            }
        }
    }

    @Composable
    private fun ShowUi() {

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Preview
    @Composable
    fun showUiPreview() {
        ShowUi()
    }

}