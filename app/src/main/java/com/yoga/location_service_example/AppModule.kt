package com.yoga.location_service_example

import com.yoga.location_service_example.viewmodel.ApplicationViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { ApplicationViewModel(androidApplication()) }
}