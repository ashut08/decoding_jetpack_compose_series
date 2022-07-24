package com.example.todo.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todo.components.FullScreenDialog
import com.example.todo.view.screens.todoList.TodoViewModel

@Composable
fun HomeScreens() {


    val openDialog = remember { mutableStateOf(false) }
    val todoViewModel by remember { mutableStateOf(TodoViewModel()) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    openDialog.value = true;
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "",

                    )
                if (openDialog.value) {
                    FullScreenDialog(
                        openDialog = openDialog,
                        todoViewModel = todoViewModel
                    )


                }
            }
        },
        topBar = {
            TopAppBar() {
                Text("To do App")
            }
        }

    ) {
        Column(

            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TodoListScreen(todoViewModel)
        }


    }
}