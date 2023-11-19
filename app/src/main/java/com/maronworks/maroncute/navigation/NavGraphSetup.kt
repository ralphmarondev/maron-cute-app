package com.maronworks.maroncute.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.maronworks.maroncute.features.gallery.GalleryScreen
import com.maronworks.maroncute.features.vscode.VsCode
import com.maronworks.maroncute.screens.home.HomeScreen
import com.maronworks.maroncute.screens.news.NewsScreen

@Composable
fun NavGraphSetup(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.Route
    ) {
        composable(Screens.Home.Route)
        {
            HomeScreen(navController = navController)
        }
        composable(Screens.Splash.Route)
        {
            // TODO: implement this
        }
        composable(Screens.News.Route)
        {
            NewsScreen(navController = navController)
        }
        composable(Screens.VsCode.Route)
        {
            VsCode(navController)
        }
        composable(Screens.Gallery.Route) {
            GalleryScreen(navController = navController)
        }
    }
}
