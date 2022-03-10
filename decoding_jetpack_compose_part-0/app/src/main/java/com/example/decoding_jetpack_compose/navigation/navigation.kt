package com.example.myapplication.navigation

enum class NavigaionScreen {
    MainScreen,
    DetailsScreen;
    companion object{
        fun fromRoute(route:String?):NavigaionScreen=
            when(route?.substringBefore(delimiter = "/")){

                MainScreen.name->MainScreen
                DetailsScreen.name->DetailsScreen
                null->MainScreen
                else -> throw  IllegalArgumentException("Route $route is not defined")
            }
    }
}