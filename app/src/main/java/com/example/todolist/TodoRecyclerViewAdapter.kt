package com.example.todolist

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.ItemTodoBinding
import com.example.todolist.db.TodoEntity

class TodoRecyclerViewAdapter(private val todoList : ArrayList<TodoEntity>) : RecyclerView.Adapter<TodoRecyclerViewAdapter.MyViewHolder>()  {
    inner class MyViewHolder(binding : ItemTodoBinding) : RecyclerView.ViewHolder(binding.root){
        val tv_importance = binding.tvImportance
        val tv_title =  binding.tvTitle

        val root = binding.root
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        /* ViewHolder 생성 */


    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        /* 생성한 ViewHolder 에 Data를 넣어준다 */
    }
    override fun getItemCount(): Int {
        /* item 개수 반환*/

    }


}