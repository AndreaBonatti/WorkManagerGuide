package com.andreabonatti92.workmanagerguide

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class DownloadApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Notification channel only for device with OREO version and newer
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "download_channel",
                "File Download",
                NotificationManager.IMPORTANCE_HIGH
            )

            val notificationManager = getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }
}