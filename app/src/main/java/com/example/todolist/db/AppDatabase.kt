package com.example.todolist.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(TodoEntity::class), version = 1) // 조건 10
abstract class AppDatabase : RoomDatabase() { // 조건2 RoomDatabase 상속
    abstract fun getTOdoDao() : TodoDao

    companion object { // 싱글톤 패턴 구현
        val databaseName = "db_todo"
        var appDatabase : AppDatabase? = null

        fun getInstance(context : Context) : AppDatabase ? {
            if(appDatabase == null){
                appDatabase = Room.databaseBuilder(context, AppDatabase :: class.java , databaseName).fallbackToDestructiveMigration().build()
            }
            return appDatabase
        }
    }
}