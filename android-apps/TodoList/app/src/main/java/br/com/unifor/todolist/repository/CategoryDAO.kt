package br.com.unifor.todolist.repository

import androidx.room.*
import br.com.unifor.todolist.model.Category

@Dao
interface CategoryDAO {

    @Insert
    fun insert(category: Category)

    @Update
    fun update(category: Category)

    @Delete
    fun delete(category: Category)

    @Query("SELECT * FROM categories WHERE id = :id")
    fun find(id:Int): Category

    @Query("SELECT * FROM categories ")
    fun findAll():List<Category>
}