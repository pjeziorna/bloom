package com.jeap.bloom.components

import android.graphics.Color
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jeap.bloom.ui.theme.Pink900
import com.jeap.bloom.ui.theme.White

@Composable
fun BloomTextButton(buttonText: String) {
    val isLight = MaterialTheme.colors.isLight
    val textColor = if(isLight) {
        Pink900
    } else {
        White
    }

    TextButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 16.dp),
        shape = MaterialTheme.shapes.medium,
    ) {
        Text(text = buttonText, color = textColor)
    }
}