package com.example.noteappmvvm.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteappmvvm.Model.TodoItem
import com.example.noteappmvvm.databinding.ItemTodoBinding

class TodoAdapter(private val todoItems: List<TodoItem>) :RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    class TodoViewHolder(private val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(todoItem: TodoItem) {
            binding.textView.text = todoItem.title
            binding.checkBox.isChecked = todoItem.isChecked
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding =ItemTodoBinding.inflate(
            LayoutInflater.from(parent.context),parent,false)
        return TodoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return todoItems.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(todoItems[position])
    }
}

