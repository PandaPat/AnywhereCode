package com.example.anywhere.api

import okhttp3.Interceptor
import okhttp3.Response

internal class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val originalUrl = request.url
        val url = originalUrl
            .newBuilder()
            .build()

        val requestBuilder = request.newBuilder().url(url)
        val newRequest = requestBuilder
            .build()
        return chain.proceed(newRequest)
    }
}