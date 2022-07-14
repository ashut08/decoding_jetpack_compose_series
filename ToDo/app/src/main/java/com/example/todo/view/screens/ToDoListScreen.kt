package com.example.todo.view.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todo.model.TodoList

@Composable


fun TodoListScreen(noteViewModel: NoteViewModel = viewModel()) {

    LazyColumn(modifier = Modifier.fillMaxHeight()) {


        items(noteViewModel.getAllToDoList()) {
            Log.e("_todoList",noteViewModel.getAllToDoList().toString())
            Row() {
                Text(it.title)
                Icon(

                    imageVector = Icons.Filled.Delete, contentDescription = "Delete",

                    modifier = Modifier.clickable {
                        noteViewModel.removeTodoItem(it)
                    }
                )


            }


        }

    }

}