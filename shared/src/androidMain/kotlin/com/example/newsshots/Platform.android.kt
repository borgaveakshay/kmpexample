@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package com.example.newsshots

import android.os.Build
import android.util.Log

actual class Platform {
    actual val deviceManufacturer: String = Build.MANUFACTURER
    actual val deviceModel: String = Build.DEVICE
    actual val osVersion: String = "Android ${Build.VERSION.SDK_INT}"

    actual fun logSystemInfo() {
        Log.d("Daily Shots", "($deviceManufacturer, $deviceModel, $osVersion)")
    }
}
