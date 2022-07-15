package com.example.todo.view.screens

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.todo.data.TodolistData
import com.example.todo.model.TodoList
import kotlin.math.log

class NoteViewModel : ViewModel() {
    private var _todoList = mutableStateListOf<TodoList>()


    init {
        _todoList.addAll(TodolistData().loadTodoList());
        Log.e("_todoList", _todoList.toString())
    }

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

//        _todoList[index].isComplete = !value;
        _todoList[index] = _todoList[index].copy(
            id = todoList.id,
            title = todoList.title,
            task = todoList.task,
            isComplete = true
        )
        Log.e("list", _todoList[index].isComplete.toString())
    }
}