package com.example.myapplication.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.model.getUsers
import com.example.myapplication.navigation.NavigaionScreen
import com.example.myapplication.widget.BuildList

@Composable
fun HomeScreen(navController: NavController) {


    BuildBody(navController)
}


@Composable
fun BuildBody(navController: NavController?) {
    Scaffold(topBar = {
        TopAppBar(


            elevation = 3.dp,


            backgroundColor = Color.White
        ) {

            Text(text = "UnderStanding JetPack Compose", color = Color.Black)

        }
    }) {
        BuildList(list = getUsers()) {
                id->
            navController?.navigate(route = NavigaionScreen.DetailsScreen.name+ "/$id")
        }
    }

}

