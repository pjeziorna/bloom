package com.jeap.bloom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jeap.bloom.ui.theme.BloomTheme
import com.jeap.bloom.ui.theme.Pink900
import com.jeap.bloom.ui.theme.White

@Composable
fun WelcomeScreen() {

    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.primary)
    ) {
        WelcomeBackground()
        WelcomeScreenContent()
    }
}

@Composable
private fun WelcomeScreenContent() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(72.dp))
        LeafBackground()
        Spacer(modifier = Modifier.height(48.dp))
        LogoImage()
        AppTitle()
        Spacer(modifier = Modifier.height(40.dp))
        CreateAccountButton()
        Spacer(modifier = Modifier.height(8.dp))
        LoginButton()
    }
}

@Composable
private fun LoginButton() {
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
    ) {
        Text(text = "Log in", color = textColor)
    }
}

@Composable
private fun CreateAccountButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary),
        shape = MaterialTheme.shapes.medium,
    ) {
        Text(text = "Create account")
    }
}

@Composable
private fun AppTitle() {
    Text(
        text = "Beautiful home garden solutions",
        style = MaterialTheme.typography.subtitle1,
        modifier = Modifier.paddingFromBaseline(32.dp)
    )
}

@Composable
private fun LogoImage() {
    val isLight = MaterialTheme.colors.isLight
    val logoImage = if (isLight) {
        R.drawable.ic_light_logo
    } else {
        R.drawable.ic_dark_logo
    }


    Image(painter = painterResource(id = logoImage), contentDescription = "Bloom")
}

@Composable
private fun LeafBackground() {
    val isLight = MaterialTheme.colors.isLight;
    val leafImage = if (isLight) {
        R.drawable.ic_light_welcome_illos
    } else {
        R.drawable.ic_dark_welcome_illos
    }

    Image(
        painter = painterResource(id = leafImage),
        contentDescription = null,
        modifier = Modifier.offset(x = 88.dp)
    )
}

@Composable
private fun WelcomeBackground(): Unit {
    val isLight = MaterialTheme.colors.isLight;

    val backgroundImage = if (isLight) {
        R.drawable.ic_light_welcome_bg
    } else {
        R.drawable.ic_dark_welcome_bg
    }

    Image(
        painter = painterResource(id = backgroundImage),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

@Preview
@Composable
fun WelcomeScreenLightPreview() {
    BloomTheme(darkTheme = false) {
        WelcomeScreen()
    }
}

@Preview
@Composable
fun WelcomeScreenDarkPreview() {
    BloomTheme(darkTheme = true) {
        WelcomeScreen()
    }
}