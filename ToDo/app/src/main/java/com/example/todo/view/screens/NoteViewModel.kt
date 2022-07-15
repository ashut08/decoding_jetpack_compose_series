package com.example.todo.view.screens

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.todo.data.TodolistData
import com.example.todo.model.TodoList
import kotlin.math.log

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


    fun markAsComplete(todoList: TodoList, value: Boolean) {
        val g =todoList.copy()
        val index = _todoList.indexOf(g);

        Log.e("index", index.toString())
        Log.e("isComplete", value.toString())

        todoList.isComplete = !g.isComplete;

        Log.e("list", _todoList[index].isComplete.toString())
    }
}