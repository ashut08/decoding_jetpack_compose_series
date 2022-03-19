package com.example.decoding_jetpack_compose_part1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


import com.example.decoding_jetpack_compose_part1.bottombar.BottomNavigationScreen

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            BottomNavigationScreen()


        }
    }





}