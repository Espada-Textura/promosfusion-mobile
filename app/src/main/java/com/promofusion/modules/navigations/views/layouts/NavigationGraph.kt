package com.promofusion.modules.navigations.views.layouts

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.promofusion.modules.main.fragments.home.views.HomeScreen
import com.promofusion.modules.navigations.views.ui.BottomNavigationBar


@Composable
fun NavigationGraph() {

    val navHostController = rememberNavController()

    Scaffold(bottomBar = { BottomNavigationBar(navHostController = navHostController) }) { paddingValues ->
        NavHost(
            navController = navHostController,
            startDestination = "home",
            modifier = Modifier.padding(paddingValues)
        ) {

            composable(route = "home") {
                HomeScreen()
            }
        }
    }

}