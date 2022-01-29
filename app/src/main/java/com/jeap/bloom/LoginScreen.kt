package com.jeap.bloom

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jeap.bloom.components.BloomOutlinedTextField
import com.jeap.bloom.components.BloomSecondaryButton
import com.jeap.bloom.ui.theme.BloomTheme

@Composable
fun LoginScreen() {
    Surface(color = MaterialTheme.colors.background, modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            LoginHeader()
            EmailInput()
            Spacer(modifier = Modifier.height(8.dp))
            PasswordInput()
            PolicyAgreementText()
            Spacer(modifier = Modifier.height(16.dp))
            LoginButton()
        }
    }
}

@Composable
private fun LoginHeader() {
    Text(
        text = "Log in with email",
        Modifier.paddingFromBaseline(top = 184.dp, bottom = 16.dp),
        style = MaterialTheme.typography.h1
    )
}

@Composable
private fun EmailInput() {
    val email = remember {
        mutableStateOf("")
    }
    BloomOutlinedTextField(
        value = email.value,
        onValueChange = { newString -> email.value = newString },
        labelText = "Email address",
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}

@Composable
private fun PasswordInput() {
    val password = remember {
        mutableStateOf("")
    }
    BloomOutlinedTextField(
        value = password.value,
        onValueChange = { newString -> password.value = newString },
        labelText = "Password (8+ characters)",
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}

@Composable
private fun PolicyAgreementText() {
    Text(
        text = "By clicking below, you agree to our Terms of Use and consent to out Privacy Policy.",
        modifier = Modifier.paddingFromBaseline(24.dp),
        style = MaterialTheme.typography.body2,
        textAlign = TextAlign.Center
    )
}

@Composable
private fun LoginButton() {
    BloomSecondaryButton(buttonText = "Log in")
}

@Preview
@Composable
fun LoginScreenLightPreview() {
    BloomTheme(darkTheme = false) {
        LoginScreen()
    }
}

@Preview
@Composable
fun LoginScreenDarkPreview() {
    BloomTheme(darkTheme = true) {
        LoginScreen()
    }
}