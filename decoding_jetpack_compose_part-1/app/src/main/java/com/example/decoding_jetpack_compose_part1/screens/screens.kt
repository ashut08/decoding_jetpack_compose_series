package com.example.decoding_jetpack_compose_part1.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

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
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(fraction = 0.6f)
            ) {
                Text("Decoding Model Bottom Sheet", textAlign = TextAlign.Center)
            }

        },


        ) {
        Scaffold(

            backgroundColor = Color.Gray.copy(alpha = 0.3f)

        ) {
            Surface(modifier = Modifier.padding(15.dp)) {


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
}


@ExperimentalAnimationApi
@Composable
fun ProfileScreen() {
    var expanded by remember {
        mutableStateOf(value = false)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()


    ) {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Column() {
                Row(modifier = Modifier.padding(10.dp)) {
                    Icon(imageVector = Icons.Filled.Person, contentDescription = "DropDown menu")

                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "john")
                    Spacer(modifier = Modifier.weight(1.0f))
                    Icon(
                        imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                        contentDescription = "DropDown menu",
                        modifier = Modifier.clickable {
                            expanded = !expanded
                        })
                }
                AnimatedVisibility(
                    modifier = Modifier

                        .padding(20.dp),
                    visible = expanded
                ) {
                    Text("+9192323249432")

                }
            }


        }

    }


}


//onClick = {

//},
