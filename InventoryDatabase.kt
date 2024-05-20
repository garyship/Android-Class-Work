package com.example.classroom.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Student::class], version = 1, exportSchema = false)
abstract  class InventoryDatabase :RoomDatabase(){
    abstract fun studentDao():StudentDao
    companion object{
        @Volatile
        private var Instance:InventoryDatabase?=null
        fun getDatabase(context: Context):InventoryDatabase{
            return Instance ?: synchronized(this){
                Room.databaseBuilder(context,InventoryDatabase::class.java,"item_database")
                    .build().also { Instance = it }
            }
        }
    }
}