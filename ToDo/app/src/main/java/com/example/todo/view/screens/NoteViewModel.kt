package com.example.todo.view.screens

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.todo.data.TodolistData
import com.example.todo.model.TodoList

class NoteViewModel : ViewModel() {
    private val _todoList = mutableStateListOf<TodoList>()


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
}