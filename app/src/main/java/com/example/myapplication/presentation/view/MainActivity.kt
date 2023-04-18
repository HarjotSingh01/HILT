package com.example.myapplication.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R
import com.example.myapplication.presentation.theme.*
import com.example.myapplication.presentation.viewmodel.HiltViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: HiltViewModel by viewModels()

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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(PADDING_DEFAULT)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = viewModel.getDifferentText.value.ifEmpty { stringResource(id = R.string.old_text) },
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = TEXT_SIZE_DEFAULT_2x,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold
                )
            }
            OutlinedButton(
                onClick = { getNewText() },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .height(BUTTON_SIZE_DEFAULT)
                    .clip(
                        Shapes.medium
                    ),
                shape = Shapes.medium
            ) {
                Text(
                    text = stringResource(id = R.string.click_to_change_text),
                    fontSize = TEXT_SIZE_DEFAULT,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
            TextButton(
                onClick = { getOldText() },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = BUTTON_SIZE_DEFAULT)
                    .padding(top = PADDING_HALF)
            ) {
                Text(
                    text = stringResource(id = R.string.get_old_text),
                    fontSize = TEXT_SIZE_DEFAULT,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

    private fun getNewText() {
        viewModel.getDifferentText()
    }

    private fun getOldText() {
        viewModel.getOldText()
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Preview
    @Composable
    fun ShowUiPreview() {
        ShowUi()
    }

}