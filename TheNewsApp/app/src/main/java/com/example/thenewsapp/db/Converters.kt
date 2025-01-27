package com.example.thenewsapp.db

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.thenewsapp.models.Source
import java.util.Date

class Converters {

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }

    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name
    }
}

