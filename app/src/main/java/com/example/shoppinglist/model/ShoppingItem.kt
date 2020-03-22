package com.example.shoppinglist.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "shopping_list_table")
data class ShoppingItem(

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "quantity")
    var quantity: Int,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null

) : Parcelable
