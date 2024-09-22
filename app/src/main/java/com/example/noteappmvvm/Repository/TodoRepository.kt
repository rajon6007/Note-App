package com.example.noteappmvvm.Repository

import com.example.noteappmvvm.Model.TodoItem

class TodoRepository {
    private val todoList = mutableListOf<TodoItem>()

    init {
        todoList.add(TodoItem(1, "Task 1", false))
        todoList.add(TodoItem(2, "Task 2", false))
        todoList.add(TodoItem(3, "Task 3", false))
        todoList.add(TodoItem(4, "Task 4", false))
        todoList.add(TodoItem(5, "Task 5", false))
    }
    fun getTodoItem() : List<TodoItem>{
        return todoList
    }
}