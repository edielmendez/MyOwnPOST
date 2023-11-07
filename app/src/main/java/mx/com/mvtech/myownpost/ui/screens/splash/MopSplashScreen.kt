package mx.com.mvtech.myownpost.ui.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

@Composable
internal fun MopSplashScreen(
    onLoadComplete: () -> Unit,
    modifier: Modifier = Modifier,
){
    Surface {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Splash Screen",
                modifier = Modifier.background(Color.White),
                color = Color.Black,
                fontSize = 48.sp
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MOPSplashScreenPrev(){
    MopSplashScreen(
        onLoadComplete = {}
    )
}