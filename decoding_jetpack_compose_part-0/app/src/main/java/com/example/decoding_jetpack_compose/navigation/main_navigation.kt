package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.screens.DetailsScreen
import com.example.myapplication.screens.HomeScreen

@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigaionScreen.MainScreen.name) {


        composable(
            NavigaionScreen.MainScreen.name
        ) {
            HomeScreen(navController = navController)
        }
        composable(NavigaionScreen.DetailsScreen.name +"/{userId}",
            arguments = listOf(navArgument(name = "userId") {
                type =
                    NavType.StringType
            })
        )

        { backStackEntry ->
            DetailsScreen(
                navController = navController, backStackEntry.arguments?.getString("userId")

            )
        }
    }
}