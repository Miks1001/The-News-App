package com.example.thenewsapp.ui

import androidx.lifecycle.ViewModelProvider
import com.example.thenewsapp.repository.NewsRepository
import android.app.Application
import androidx.lifecycle.ViewModel

class NewsViewModelProviderFactory (val app: Application, val newsRepository: NewsRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(app, newsRepository) as T
    }
}