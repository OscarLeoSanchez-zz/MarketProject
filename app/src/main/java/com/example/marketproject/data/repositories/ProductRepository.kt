package com.example.marketproject.data.repositories

import com.example.marketproject.data.mockups.ProductMock
import com.example.marketproject.data.model.Product
import javax.sql.CommonDataSource

class ProductRepository(private val dataSource: ProductMock) {
    suspend fun loadProducts(): List<Product>{
        return dataSource.loadProduct()
    }
}