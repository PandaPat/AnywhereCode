package com.example.anywhere.model.entity

import com.example.anywhere.model.Meta
import com.example.anywhere.model.RelatedTopic
import com.squareup.moshi.Json

data class Character(
    @Json(name = "Abstract") val abstract: String,
    @Json(name = "AbstractSource") val abstractSource: String,
    @Json(name = "AbstractText") val abstractText: String,
    @Json(name = "AbstractURL") val abstractURL: String,
    @Json(name = "Answer") val answer: String,
    @Json(name = "AnswerType") val answerType: String,
    @Json(name = "Definition") val definition: String,
    @Json(name = "DefinitionSource") val definitionSource: String,
    @Json(name = "DefinitionURL") val definitionURL: String,
    @Json(name = "Entity") val entity: String,
    @Json(name = "Heading") val heading: String,
    @Json(name = "Image") val image: String,
    @Json(name = "ImageHeight") val imageHeight: Long,
    @Json(name = "ImageIsLogo") val imageIsLogo: Long,
    @Json(name = "ImageWidth") val imageWidth: Long,
    @Json(name = "Infobox") val infobox: String,
    @Json(name = "Redirect") val redirect: String,
    @Json(name = "RelatedTopics") val relatedTopics: List<RelatedTopic>,
    @Json(name = "Results") val results: List<Any?>,
    @Json(name = "Type") val type: String,
    val meta: Meta,
)