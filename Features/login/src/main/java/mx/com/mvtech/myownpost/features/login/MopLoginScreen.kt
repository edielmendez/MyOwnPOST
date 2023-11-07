package mx.com.mvtech.myownpost.features.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MopLoginScreen(){
    Surface {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Login Screenn",
                modifier = Modifier.background(Color.White),
                color = Color.Black,
                fontSize = 48.sp
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MopLoginScreenPrev(){
    MopLoginScreen()
}