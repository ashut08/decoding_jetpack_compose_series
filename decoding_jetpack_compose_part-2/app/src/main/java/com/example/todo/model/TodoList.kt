package com.example.todo.model

data class TodoList(

    val id:String,
    val title:String,
    val task:String,
    var isComplete:Boolean
);
