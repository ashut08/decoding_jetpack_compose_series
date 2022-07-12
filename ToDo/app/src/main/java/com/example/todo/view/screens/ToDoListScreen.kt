package com.example.todo.view.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import com.example.todo.model.TodoList

@Composable


fun TodoListScreen(list: List<TodoList>) {

    LazyColumn {
        item(list) {

            Text(text = list[0].title)

        }
    }

}