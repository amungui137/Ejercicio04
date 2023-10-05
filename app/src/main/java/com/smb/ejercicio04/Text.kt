package com.smb.ejercicio04

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Preview(
    name = "P1",
    showBackground = true,
    fontScale = 1.2f,
    showSystemUi = true,
    apiLevel = 29,
    device = Devices.NEXUS_6,
    //backgroundColor = 10000000,
    //uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun myText() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(20.dp)) {
        Text(text = "Esto es un ejemplo")
        Text(text = "Esto es un ejemplo", color = Color.Blue)
        Text(text = "Esto es un ejemplo", fontWeight = FontWeight.ExtraBold)
        Text(text = "Esto es un ejemplo", fontWeight = FontWeight.Light)
        Text(text = "Esto es un ejemplo", fontFamily = FontFamily.Cursive)
        Text(
            text = "Esto es un ejemplo",
            textDecoration = TextDecoration.LineThrough
        )
        Text(
            text = "Esto es un ejemplo",
            textDecoration = TextDecoration.Underline
        )
        Text(
            text = "Esto es un ejemplo",
            textDecoration = TextDecoration.combine(
                listOf(TextDecoration.Underline, TextDecoration.LineThrough)
            )
        )
        Text(text = "Esto es un ejemplo", fontSize = 20.sp)
        Text(stringResource(R.string.miTextoXml))
        Text(stringResource(R.string.format_string_res, 2), fontSize = 10.em)
        for (item in stringArrayResource(R.array.string_array_res)) {
            Text(item)
        }
        val besleyFontFamily = FontFamily(
            Font(R.font.besley_regular, FontWeight.Normal)
        )
        Text(
            "Besley Normal",
            fontFamily = besleyFontFamily,
            fontWeight = FontWeight.Normal
        )
        val styles = listOf(
            AnnotatedString.Range(SpanStyle(Color.Green, fontSize = 24.sp), 0, 5),
            AnnotatedString.Range(SpanStyle(Color.Blue, fontSize = 16.sp), 5, 8),
            AnnotatedString.Range(SpanStyle(Color.Red, fontSize = 12.sp), 9, 19)
        )
        Text(AnnotatedString("IES Punta del Verde", styles))
    }
}