package mx.com.mvtech.myownpost

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import mx.com.mvtech.myownpost.navigation.MopAppState
import mx.com.mvtech.myownpost.navigation.MyOwnPOSTNavHost
import mx.com.mvtech.myownpost.navigation.rememberMopAppState
import java.lang.reflect.Modifier

@Composable
fun MyOwnPOSTApp(
    appState: MopAppState = rememberMopAppState()
){
    Column(

    ) {
        MyOwnPOSTNavHost(
            appState = appState,
            onShowSnackbar = { message, action ->
                true
            }
        )
    }
}