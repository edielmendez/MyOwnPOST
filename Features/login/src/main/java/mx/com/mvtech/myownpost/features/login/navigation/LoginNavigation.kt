package mx.com.mvtech.myownpost.features.login.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import mx.com.mvtech.myownpost.features.login.MopLoginScreen


const val loginScreenNavigationRoute = "mop_login_screen_route"
fun NavController.navigateToLoginScreen(navOptions: NavOptions? = null) {
    this.navigate(loginScreenNavigationRoute, navOptions)
}

fun NavGraphBuilder.loginScreen() {
    composable(
        route = loginScreenNavigationRoute,
        deepLinks = emptyList(),
        arguments = emptyList(),
    ) {
        MopLoginScreen()
    }
}