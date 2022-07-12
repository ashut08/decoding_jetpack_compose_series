package com.example.todo.data

import com.example.todo.model.TodoList

class TodolistData {

    fun loadTodoList(): List<TodoList> {
        return listOf(
            TodoList(
                id = ":",
                task = "dasd",
                title = "dsadsad",
                isComplete = false
            )
        );
    }
}
