package com.maronworks.maroncute

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.maronworks.maroncute.navigation.NavGraphSetup

@Composable
fun MaronCuteApp() {
    val navController = rememberNavController()

    NavGraphSetup(navController = navController)
}
