package com.jeap.bloom.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BloomOutlinedTextField(value: String, onValueChange: (String) -> Unit, labelText: String) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = labelText,
                style = MaterialTheme.typography.body1
            )
        },
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth()
    )
}