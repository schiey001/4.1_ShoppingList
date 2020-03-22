package com.example.shoppinglist.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.shoppinglist.model.ShoppingItem

@Dao
interface ProductDao {

    @Query("SELECT * FROM shopping_list_table")
    suspend fun getAllProducts(): List<ShoppingItem>

    @Insert
    suspend fun insertProduct(product: ShoppingItem)

    @Delete
    suspend fun deleteProduct(product: ShoppingItem)

    @Query("DELETE FROM shopping_list_table")
    suspend fun deleteAllProducts()

}