package com.example.todo.view.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

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
                Log.e("_todoList", "" + it.isComplete)


                Card(
                    backgroundColor = Color.Gray,
                    shape = RoundedCornerShape(20.dp),
                    elevation = 1.dp,
                    modifier = Modifier.padding(5.dp)
                ) {

                    Row(
                        modifier = Modifier.padding(20.dp),
                    ) {
                        Text(
                            it.task,
                            textDecoration =

                            if (it.isComplete) {
                                TextDecoration.LineThrough
                            } else {
                                TextDecoration.None
                            }


                        )
                        Spacer(modifier = Modifier.fillMaxSize(0.7f))

                        Checkbox(
                            checked = it.isComplete,


                            onCheckedChange = { value ->


                                noteViewModel.markAsComplete(todoList = it, value = value)

                            },
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(

                            imageVector = Icons.Filled.Delete, contentDescription = "Delete",

                            modifier = Modifier.clickable {
                                noteViewModel.removeTodoItem(it)
                            },
                            tint = Color.Red
                        )


                    }
                }
            }


        }

    }
}
