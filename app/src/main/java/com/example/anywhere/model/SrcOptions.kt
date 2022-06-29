package com.example.anywhere.model

import com.squareup.moshi.Json

data class SrcOptions(
    val directory: String,
    @Json(name = "is_fanon") val isFanon: Long,
    @Json(name = "is_mediawiki") val isMediawiki: Long,
    @Json(name = "is_wikipedia") val isWikipedia: Long,
    @Json(name = "min_abstract_length") val minAbstractLength: String,
    @Json(name = "skip_abstract") val skipAbstract: Long,
    @Json(name = "skip_abstract_paren") val skipAbstractParen: Long,
    @Json(name = "skip_end") val skipEnd: String,
    @Json(name = "skip_icon") val skipIcon: Long,
    @Json(name = "skip_image_name") val skipImageName: Long,
    @Json(name = "skip_qr") val skipQr: String,
    @Json(name = "source_skip") val sourceSkip: String,
    @Json(name = "src_info") val srcInfo: String,
    val language: String,
)