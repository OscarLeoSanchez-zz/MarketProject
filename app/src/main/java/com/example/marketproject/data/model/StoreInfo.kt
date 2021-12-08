package com.example.marketproject.data.model

import java.net.Inet4Address

data class StoreInfo(
    var id: String,
    var name: String,
    var image: String,
    var address: String,
    var description: String,
    var lat: Double? = null,
    var log: Double? = null
)