package com.example.anywhere.model


import com.squareup.moshi.Json

data class Meta(
    val attribution: Any? = null,
    val blockgroup: Any? = null,
    val description: String,
    val designer: Any? = null,
    val developer: List<Developer>,
    val id: String,
    val maintainer: Maintainer,
    val name: String,
    val producer: Any? = null,
    val repo: String,
    val status: String,
    val tab: String,
    val topic: List<String>,
    val unsafe: Long,
    @Json(name = "created_date") val createdDate: Any? = null,
    @Json(name = "dev_date") val devDate: Any? = null,
    @Json(name = "dev_milestone") val devMilestone: String,
    @Json(name = "example_query") val exampleQuery: String,
    @Json(name = "perl_module") val perlModule: String,
    @Json(name = "production_state") val productionState: String,
    @Json(name = "signal_from") val signalFrom: String,
    @Json(name = "src_domain") val srcDomain: String,
    @Json(name = "src_id") val srcID: Long,
    @Json(name = "src_name") val srcName: String,
    @Json(name = "src_options") val srcOptions: SrcOptions,
    @Json(name = "src_url") val srcURL: Any? = null,
    @Json(name = "is_stackexchange") val isStackexchange: Any? = null,
    @Json(name = "js_callback_name") val jsCallbackName: String,
    @Json(name = "live_date") val liveDate: Any? = null,
)
