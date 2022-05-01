package com.example.decoding_jetpack_compose_part1.widget

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.decoding_jetpack_compose_part1.model.ScreenModel


@Composable

fun BottomBar(
    modifier: Modifier = Modifier,
    screens: List<ScreenModel.HomeScreens>,
    navController: NavController,

    ) {
    BottomNavigation {
        val backStackEntry = navController.currentBackStackEntryAsState()
        screens.forEach {


                screens ->
            val currentRoute = backStackEntry.value?.destination?.route;
            val selected = currentRoute == screens.route

            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = screens.icon,
                        contentDescription = "",
                        tint = if (selected) Color.White else Color.Black
                    )
                },
                selected = selected,
                label = {
                    Text(
                        if (selected) screens.title else "", // Label
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                },

                onClick = {
                    if (currentRoute != screens.route) {
                        navController.navigate(screens.route)

                    }

                }

            )
        }

    }

}