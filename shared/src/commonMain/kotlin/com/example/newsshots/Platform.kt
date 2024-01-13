package com.example.newsshots

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class Platform {
    val deviceManufacturer: String
    val deviceModel: String
    val osVersion: String

    fun logSystemInfo()
}
