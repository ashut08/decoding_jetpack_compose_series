package com.example.todo.view.screens

import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.todo.components.FullScreenDialog
import com.example.todo.data.TodolistData
import com.example.todo.model.TodoList

@Composable
fun HomeScreens() {


    val openDialog = remember { mutableStateOf(false) }


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
                    FullScreenDialog(openDialog = openDialog)
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
        val todolist=remember{ mutableStateListOf<TodoList>() }
        TodoListScreen(TodolistData().loadTodoList())

    }
}