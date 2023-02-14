package com.example.eventbookingapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object EventModule {

    @Singleton
    @Provides
    fun providesTestData() : String{
        return "Hello Faisal this is a test !"
    }


}