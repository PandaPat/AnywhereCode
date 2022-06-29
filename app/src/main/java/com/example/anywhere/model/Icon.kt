package com.example.anywhere.model

import com.squareup.moshi.Json

data class Icon(
    @Json(name = "Height") val height: String,
    @Json(name = "URL") val url: String,
    @Json(name = "Width") val width: String,
)
