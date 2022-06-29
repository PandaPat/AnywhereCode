package com.example.anywhere.model

import com.squareup.moshi.Json

data class RelatedTopic(
    @Json(name = "FirstURL") val firstURL: String,
    @Json(name = "Icon") val icon: Icon,
    @Json(name = "Result") val result: String,
    @Json(name = "Text") val text: String,
)