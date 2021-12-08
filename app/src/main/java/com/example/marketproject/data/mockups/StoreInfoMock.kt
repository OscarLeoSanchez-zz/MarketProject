package com.example.marketproject.data.mockups

import com.example.marketproject.data.model.StoreInfo

class StoreInfoMock {
    fun loadInfo(): StoreInfo {
        return StoreInfo(
            id = "1",
            name = "Mi tienda",
            image = "http://i.imgur.com/COzBnru.jpg",
            address = "Calle 1 N 3-4",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        )
    }
}