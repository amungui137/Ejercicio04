package com.smb.ejercicio04

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    name = "P1",
    showBackground = true,
    fontScale = 1.2f,
    showSystemUi = true,
    apiLevel = 33,
    device = Devices.NEXUS_6,
    //backgroundColor = 10000000,
    //uiMode = UI_MODE_NIGHT_YES
)

@Composable
fun MyProgress() {
    var showLoading by rememberSaveable {
        mutableStateOf(false)
    }

    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading) {
            CircularProgressIndicator(
                color = Color.Red,
                strokeWidth = 8.dp

            )
        }

        LinearProgressIndicator(
            modifier = Modifier.padding(top = 32.dp),
            color = Color.Red,
            trackColor = Color.Green
        )

        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "Cargar perfil")
        }
    }
}

@Composable
fun MyProgressAdvance() {
    var progressStatus by rememberSaveable {
        mutableStateOf(0f)
    }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LinearProgressIndicator(progress = progressStatus)

        Row(
            Modifier
                .fillMaxWidth()
                .padding(30.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { progressStatus += 0.1f }) {
                Text(text = "Sumar")
            }
            Button(onClick = { progressStatus -= 0.1f }) {
                Text(text = "Restar")
            }
        }
    }
}