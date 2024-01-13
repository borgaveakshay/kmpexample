@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package com.example.newsshots

import platform.Foundation.NSLog
import platform.UIKit.UIDevice

actual class Platform {

    actual val deviceManufacturer: String = UIDevice.currentDevice.systemName()
    actual val deviceModel: String = UIDevice.currentDevice.localizedModel
    actual val osVersion: String = UIDevice.currentDevice.systemVersion

    actual fun logSystemInfo() {
        NSLog("iOS Platform ", "($deviceManufacturer, $deviceModel, $osVersion)")
    }
}

