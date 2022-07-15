package com.example.todo.view.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todo.components.FullScreenDialog
import com.example.todo.data.TodolistData
import com.example.todo.model.TodoList

@Composable
fun HomeScreens() {


    val openDialog = remember { mutableStateOf(false) }
    val todoViewModel by remember { mutableStateOf(NoteViewModel()) }

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
                    modifier = Modifier.clickable {

//                        openDialog.value = true;

                    })
                if (openDialog.value) {
                    FullScreenDialog(
                        openDialog = openDialog,
                        noteViewModel = todoViewModel
                    )
//                        openDialog.value = false

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

    modifier = Modifier.padding(20.dp).fillMaxHeight(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    TodoListScreen(todoViewModel )
}


    }
}