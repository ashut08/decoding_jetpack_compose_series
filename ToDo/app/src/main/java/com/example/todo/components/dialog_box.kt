package com.example.todo.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.example.todo.model.TodoList

@Composable
fun FullScreenDialog(openDialog: MutableState<Boolean>) {
    var title by remember { mutableStateOf(TextFieldValue("")) }
    var task by remember { mutableStateOf(TextFieldValue("")) }
    val todolist = remember { mutableStateListOf <TodoList>() }
    AlertDialog(
        properties = DialogProperties(dismissOnBackPress = true, dismissOnClickOutside = false),

        shape = RoundedCornerShape(16.dp),
        onDismissRequest = {
            // Dismiss the dialog when the user clicks outside the dialog or on the back
            // button. If you want to disable that functionality, simply use an empty
            // onCloseRequest.
            openDialog.value = false
        },
        title = {
            Text(text = "Add Task")
        },

        text = {
            Column() {
                TextField(
                    value = title,
                    onValueChange = { newText ->
                        title = newText
                    },

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.Gray,


                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    )

                )
                TextField(
                    value = task, onValueChange = { newText ->
                        task = newText
                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.textFieldColors(

                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    )
                )
            }

        },
        confirmButton = {
            Button(

                onClick = {
                    openDialog.value = false
                    todolist.add(
                        TodoList(
                            id = "ds",
                            title = title.text,
                            task = task.text,
                            isComplete = false

                        )
                    )
                }) {
                Text("This is the Confirm Button")
            }
        },
        dismissButton = {
            Button(

                onClick = {
                    openDialog.value = false
                }) {
                Text("This is the dismiss Button")
            }
        }

    )


}
