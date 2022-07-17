package com.example.todo.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todo.model.TodoList
import com.example.todo.view.screens.NoteViewModel
import java.util.*

@Composable
fun FullScreenDialog(
    openDialog: MutableState<Boolean>,
    noteViewModel: NoteViewModel = viewModel()


) {
    var title by remember { mutableStateOf(TextFieldValue("")) }
    var task by remember { mutableStateOf(TextFieldValue("")) }
//    val todo by remember { mutableStateOf(NoteViewModel()) }
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
            Text(
                text = "Add Task", modifier = Modifier.padding(20.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        },

        text = {
            Column(
                modifier = Modifier.padding(10.dp),
            ) {

                TextField(
                    value = task, onValueChange = { newText ->
                        task = newText
                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
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
                    if (task.text.isNotEmpty()) {


                        noteViewModel.addTodoList(
                            TodoList(
                                id = UUID.randomUUID().toString(),

                                task = task.text,
                                isComplete = false

                            )
                        )
                        openDialog.value = false
                    }
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
            ) {
                Text(
                    "Add", color = Color.White,
                )
            }
        },
        dismissButton = {
            Button(

                onClick = {
                    openDialog.value = false
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
            ) {
                Text(
                    "Cancel", color = Color.White,
                )
            }
        }

    )


}
