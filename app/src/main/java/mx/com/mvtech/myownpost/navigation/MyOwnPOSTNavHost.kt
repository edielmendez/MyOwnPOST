package mx.com.mvtech.myownpost.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import mx.com.mvtech.myownpost.ui.screens.splash.navigation.splashScreen
import mx.com.mvtech.myownpost.ui.screens.splash.navigation.splashScreenNavigationRoute

@Composable
fun MyOwnPOSTNavHost(
    appState: MopAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = splashScreenNavigationRoute,
){
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        splashScreen(
            onFinishLoad = navController::navigateToLogin
        )
    }
}