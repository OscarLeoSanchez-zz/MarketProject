package com.example.marketproject.di

import com.example.marketproject.data.repositories.ProductRepository
import com.example.marketproject.data.repositories.StoreRepository
import org.koin.dsl.module
import kotlin.math.sin

val repoModule = module {
    single { StoreRepository(get()) }
    single { ProductRepository(get()) }
}