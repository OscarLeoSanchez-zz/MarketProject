package com.example.marketproject.ui.listeners

import com.example.marketproject.data.model.Product

interface OnProductListener {
    fun onClick(item: Product)
}