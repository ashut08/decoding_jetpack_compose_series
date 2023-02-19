package com.example.todo.view.screens.todoList

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.todo.model.TodoList

class TodoViewModel : ViewModel() {
    private var _todoList = mutableStateListOf<TodoList>()


    fun getAllToDoList(): List<TodoList> {
        return _todoList;
    }

    fun addTodoList(todoItem: TodoList) {
        _todoList.add(todoItem)
    }


    fun removeTodoItem(todoItem: TodoList) {

        _todoList.remove(todoItem)
    }


    fun markAsComplete(todoItem: TodoList, value: Boolean) {


        val index = _todoList.indexOf(todoItem);

        _todoList[index] = _todoList[index].let {
            it.copy(
                id = it.id,
                task = it.task,

                isComplete = adjust(_todoList[index])
            )

        }
    }

    private fun adjust(todoList: TodoList): Boolean {
        return !todoList.isComplete
    }
}