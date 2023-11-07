package mx.com.mvtech.myownpost.ui.screens.splash.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import mx.com.mvtech.myownpost.ui.screens.splash.MopSplashScreen

//const val LINKED_NEWS_RESOURCE_ID = "linkedNewsResourceId"
const val splashScreenNavigationRoute = "mop_splas_screen_route"
//private const val DEEP_LINK_URI_PATTERN = "https://www.nowinandroid.apps.samples.google.com/foryou/{$LINKED_NEWS_RESOURCE_ID}"

fun NavController.navigateToSplashScreen(navOptions: NavOptions? = null) {
    this.navigate(splashScreenNavigationRoute, navOptions)
}

fun NavGraphBuilder.splashScreen(onFinishLoad: () -> Unit) {
    composable(
        route = splashScreenNavigationRoute,
        deepLinks = listOf(),
        arguments = listOf(),
    ) {
        MopSplashScreen(onFinishLoad)
    }
}