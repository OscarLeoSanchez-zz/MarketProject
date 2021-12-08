package com.example.marketproject

import android.util.Patterns
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide

fun CharSequence?.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

fun loadItemPicture(picture: String?, imageView: AppCompatImageView) {
    Glide.with(imageView.context)
        .load(picture)
        .into(imageView)
}