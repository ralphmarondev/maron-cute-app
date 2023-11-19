package com.maronworks.maroncute.navigation

sealed class Screens(val Route: String) {
    object Home : Screens("home_screen")
    object Splash: Screens("splash_screen")
    object News: Screens("news_screen")
    object VsCode: Screens("vs_code_screen")
}
