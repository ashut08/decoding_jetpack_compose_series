package com.example.decoding_jetpack_compose_part1.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.decoding_jetpack_compose_part1.model.ScreenModel
import com.example.decoding_jetpack_compose_part1.navigation.Navigation
import com.example.decoding_jetpack_compose_part1.widget.BottomBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun BottomNavigationScreen() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()


    val navController = rememberNavController()
    Scaffold(
        scaffoldState = scaffoldState,

        drawerGesturesEnabled = true,

        drawerContent = {
            Drawer(

                item = ScreenModel().screensInHomeFromBottomNav,

                navController = navController,

                scope = scope,
                scaffoldState = scaffoldState

            )
        },
        topBar = {
            TopAppBar(
                title = { Text(text = "Decoding Jetpack Compose") }, navigationIcon = {

                    IconButton(onClick = {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    })

                    {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                    }
                }

            )


        },

        bottomBar = {

            BottomBar(
                screens = ScreenModel().screensInHomeFromBottomNav,
                navController = navController,

                )


        },
    ) {

        Navigation(navController = navController)
    }


}


@Composable
fun Drawer(
    item: List<ScreenModel.HomeScreens>,

    navController: NavController,
    scaffoldState: ScaffoldState,
    scope: CoroutineScope
) {

    Column() {
        Surface(
            modifier = Modifier

                .fillMaxWidth(1f)
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(text = "I", fontSize = 28.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(7.dp))
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "",
                    tint = Color.Red,
                    modifier = Modifier.height(40.dp)
                )
                Spacer(modifier = Modifier.width(7.dp))
                Text("Jetpack Compose", fontSize = 28.sp, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        item.forEach() { item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = {
                        navController.navigate(item.route)
                        // Closenav drawer
                        scope.launch {
                            scaffoldState.drawerState.close()
                        }
                        // Close drawer


                    })
                    .height(45.dp)

                    .padding(start = 10.dp)
            ) {
                Icon(imageVector = item.icon, contentDescription = "")
                Spacer(modifier = Modifier.width(7.dp))
                Text(
                    text = item.title,
                    fontSize = 18.sp,
                    color = Color.Black
                )
            }


        }
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Decoding Jetpack-Compose",

            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(30.dp))
    }


}

@Preview
@Composable
fun PreviewMainScreen() {
    BottomNavigationScreen()
}