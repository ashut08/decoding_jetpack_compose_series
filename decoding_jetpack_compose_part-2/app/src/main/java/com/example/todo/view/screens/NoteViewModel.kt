package com.example.todo.view.screens

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.todo.model.TodoList

class NoteViewModel : ViewModel() {
    private var _todoList = mutableStateListOf<TodoList>()


    fun getAllToDoList(): List<TodoList> {
        return _todoList;
    }

    fun addTodoList(todoList: TodoList) {
        _todoList.add(todoList)
    }


    fun removeTodoItem(todoList: TodoList) {

        _todoList.remove(todoList)
    }


    fun markAsComplete(todoList: TodoList, value: Boolean) {


        val index = _todoList.indexOf(todoList);
        Log.e("index", index.toString())
        Log.e("isComplete", value.toString())

        _todoList[index] = _todoList[index].let {
            it.copy(
                id = it.id,
                task = it.task,

                isComplete = value


            )

        }
        // _todoList[index] = _todoList[index];
//        Log.e("list", _todoList[index].isComplete.toString())
    }
}