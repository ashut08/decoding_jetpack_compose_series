package com.example.decoding_jetpack_compose_part1.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import kotlin.math.floor

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)


    )


    {

        Text(
            text = "Home screen", modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SearchScreen() {

    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
    )
    val coroutineScope = rememberCoroutineScope()

    BottomSheetScaffold(
        scaffoldState = bottomSheetScaffoldState,
        sheetElevation = 2.dp,

        sheetShape = RoundedCornerShape(16.dp),

        sheetContent = {
            Surface(
                modifier = Modifier.fillMaxWidth().fillMaxHeight(fraction = 0.6f)
            ) {
                Text("Decoding Model Bottom Sheet", textAlign = TextAlign.Center)
            }

        },


        ) {
        Scaffold(

            backgroundColor = Color.Gray.copy(alpha = 0.3f)

        ) {

            TextField(
                value = "Search..", onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.White,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                trailingIcon = {
                    Icon(Icons.Filled.Search, "", tint = Color.Blue,
                        modifier = Modifier.clickable {
                            coroutineScope.launch {
                                if (bottomSheetScaffoldState.bottomSheetState.isCollapsed) {
                                    bottomSheetScaffoldState.bottomSheetState.expand()
                                } else {
                                    bottomSheetScaffoldState.bottomSheetState.collapse()
                                }
                            }

                        }
                    )
                },

                )
        }

    }
}


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()

            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Profile Screen", modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}


//onClick = {

//},
