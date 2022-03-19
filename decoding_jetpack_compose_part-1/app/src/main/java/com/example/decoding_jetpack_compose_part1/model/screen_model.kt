package com.example.decoding_jetpack_compose_part1.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

class ScreenModel {

    sealed class HomeScreens(
        val route: String,
        val title: String,
        val icon: ImageVector
    ) {
        object Home : HomeScreens("home", "Home", Icons.Filled.Home)
        object Search : HomeScreens("search", "Search", Icons.Filled.Search)
        object Profile : HomeScreens("profile", "MyNetwork", Icons.Filled.Person)

    }

    val screensInHomeFromBottomNav = listOf(
        HomeScreens.Home, HomeScreens.Search, HomeScreens.Profile
    )

}