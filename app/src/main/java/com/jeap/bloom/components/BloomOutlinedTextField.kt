package com.jeap.bloom.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jeap.bloom.ui.theme.BloomTheme

@Composable
fun BloomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
) {
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
            .fillMaxWidth(),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colors.secondary.copy(alpha = ContentAlpha.high),
            focusedLabelColor = MaterialTheme.colors.secondary.copy(alpha = ContentAlpha.high),
            cursorColor = MaterialTheme.colors.secondary.copy(alpha = ContentAlpha.high),
        ),
        keyboardOptions = keyboardOptions,
        visualTransformation = visualTransformation
    )
}

@Preview
@Composable
fun OutlinedTextFieldLightPreview() {
    BloomTheme(darkTheme = false) {
        OutlinedTextField(value = "", onValueChange = {})
    }
}

@Preview
@Composable
fun OutlinedTextFieldDarkPreview() {
    BloomTheme(darkTheme = true) {
        OutlinedTextField(value = "", onValueChange = {})
    }
}