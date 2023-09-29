package com.example.todolist

import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.ItemTodoBinding
import com.example.todolist.db.TodoEntity

class TodoRecyclerViewAdapter(private val todoList : ArrayList<TodoEntity>) {
    inner class MyViewHolder(binding : ItemTodoBinding
    ) : RecyclerView.ViewHolder(binding.root){

    }
}