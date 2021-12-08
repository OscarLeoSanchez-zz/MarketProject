package com.example.marketproject.di

import com.example.marketproject.ui.viewmodels.ProductViewModel
import com.example.marketproject.ui.viewmodels.StoreViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { StoreViewModel(get()) }
    viewModel { ProductViewModel(get())}
}