package com.example.thenewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.Date


@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val title: String,
    val source: Source,
    val url: String,
    val urlToImage: String
): Serializable