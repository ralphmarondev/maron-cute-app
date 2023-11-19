package com.maronworks.maroncute.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun NormalText(
    text: String,
    fontSize: TextUnit = 12.sp
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontFamily = FontFamily.Monospace
    )
}
