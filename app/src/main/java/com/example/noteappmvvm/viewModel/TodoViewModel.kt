package com.example.noteappmvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.noteappmvvm.Model.TodoItem
import com.example.noteappmvvm.Repository.TodoRepository

class TodoViewModel:ViewModel() {
    private val repository = TodoRepository()
    private val _todoItems = MutableLiveData<List<TodoItem>>()

     val todoItems: LiveData<List<TodoItem>> = _todoItems

    init {
        _todoItems.value = repository.getTodoItem()
    }
    fun markAsDone(id: Int) {
        val updatedList= todoItems.value?.map {
            if (it.id == id) {
                it.copy(isChecked = true)
            } else {
                it
            }
        }
        _todoItems.value = updatedList
    }
}