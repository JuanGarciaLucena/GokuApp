package com.juanlucena.gokuapp

import android.app.Application
import android.content.Context
import com.path.android.jobqueue.JobManager
import org.greenrobot.eventbus.EventBus

class MainApplication : Application(){

    lateinit var jobManager : JobManager


    override fun onCreate() {
        super.onCreate()

        jobManager = JobManager(this)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}