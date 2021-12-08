package com.example.marketproject.di

import com.example.marketproject.data.mockups.ProductMock
import com.example.marketproject.data.mockups.StoreInfoMock
import org.koin.dsl.module

val dataSourceMode = module {
    single { ProductMock() }
    single { StoreInfoMock() }
}