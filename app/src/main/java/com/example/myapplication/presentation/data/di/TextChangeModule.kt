package com.example.myapplication.presentation.data.di

import android.content.Context
import com.example.myapplication.presentation.data.repo.TextChangeRepo
import com.example.myapplication.presentation.data.repo.TextChangeRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * Created by Harjot Singh on 18/04/23
 */
@Module
@InstallIn(ViewModelComponent::class)
internal class TextChangeModule {
    @Provides
    @ViewModelScoped
    fun provideTextChangeRepo(@ApplicationContext context: Context): TextChangeRepo {
        return TextChangeRepoImpl(context)
    }
}