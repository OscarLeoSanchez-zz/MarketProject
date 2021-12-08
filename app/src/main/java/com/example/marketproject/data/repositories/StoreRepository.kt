package com.example.marketproject.data.repositories

import com.example.marketproject.data.mockups.StoreInfoMock
import com.example.marketproject.data.model.StoreInfo
import javax.sql.CommonDataSource

class StoreRepository(val dataSource: StoreInfoMock) {
    suspend fun loadInfo(): StoreInfo {
        return dataSource.loadInfo()
    }
}