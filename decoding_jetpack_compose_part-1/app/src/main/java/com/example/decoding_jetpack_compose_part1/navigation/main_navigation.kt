package com.example.decoding_jetpack_compose_part1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.decoding_jetpack_compose_part1.screens.HomeScreen
import com.example.decoding_jetpack_compose_part1.screens.ProfileScreen
import com.example.decoding_jetpack_compose_part1.screens.SearchScreen


@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen()
        }
        composable("search") {
            SearchScreen()
        }
        composable("profile") {
          ProfileScreen()
        }

    }
}