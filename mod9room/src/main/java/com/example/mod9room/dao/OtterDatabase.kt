package com.example.mod9room.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mod9room.bo.Otter

@Database(entities = [Otter::class], version = 1)
abstract class OtterDatabase : RoomDatabase() {
    abstract fun otterDao() : OtterDao

    companion object{
        private var INSTANCE :OtterDatabase? = null
        fun getInstance(context: Context): OtterDatabase {
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    context,OtterDatabase::class.java,"otterdb"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}