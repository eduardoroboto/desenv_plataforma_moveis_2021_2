package br.com.unifor.todolist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "categories",
    indices = [
        Index("name", unique = true)
    ]
)
data class Category(
   @PrimaryKey
    val id:Int? = null,
    val name:String,
    val description:String,
   @ColumnInfo(name = "user_id")
    val userId:Int,
)
