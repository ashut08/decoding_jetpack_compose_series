package com.example.todo.view.screens

import android.util.Log
import android.widget.Space
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todo.model.TodoList

@Composable


fun TodoListScreen(noteViewModel: NoteViewModel = viewModel()) {

    val checkedState = remember { mutableStateOf(true) }
    if (noteViewModel.getAllToDoList().isEmpty())


        Text(
            text = "Nothing Here ", textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxHeight()

        )
    else {
        LazyColumn(modifier = Modifier.fillMaxHeight()) {


            items(noteViewModel.getAllToDoList()) {
                Log.e("_todoList",""+it.isComplete)


                Row() {
                    Text(
                        it.title,
                        textDecoration =

                        if (checkedState.value) {
                            TextDecoration.LineThrough
                        } else {
                            TextDecoration.None
                        }

                    )

                    Checkbox(
                        checked = it.isComplete,


                        onCheckedChange = { value ->


                            noteViewModel.markAsComplete(todoList = it, value = value)

                        },
                    )
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
}
