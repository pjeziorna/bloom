package com.jeap.bloom

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    BloomOutlinedTextField(value = "", onValueChange = {}, labelText = "Email address")
}

@Composable
private fun PasswordInput() {
    BloomOutlinedTextField(value = "", onValueChange = {}, labelText = "Password (8+ characters)")
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