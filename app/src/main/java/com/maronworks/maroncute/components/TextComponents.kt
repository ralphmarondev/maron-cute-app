package com.maronworks.maroncute.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
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

@Composable
fun TitleText(
    text: String,
    fontSize: TextUnit = 18.sp
) {
    Text(
        text = text,
        color = MaterialTheme.colorScheme.onPrimary,
        fontSize = fontSize,
        fontWeight = FontWeight.SemiBold,
        fontFamily = FontFamily.Monospace,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1
    )
}
