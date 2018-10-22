
package com.juanlucena.gokuapp.tasks.jobs

import android.util.Log
import com.juanlucena.gokuapp.di.DIManager
import com.juanlucena.gokuapp.objects.NetworkConnection
import com.juanlucena.gokuapp.services.SearchService
import com.path.android.jobqueue.Job
import com.path.android.jobqueue.Params
import javax.inject.Inject


class DelayJob internal constructor() : Job(Params(1)) {

    @Inject
    lateinit var networkConnection: NetworkConnection


    init {
        DIManager.getComponent().inject(this)
    }
    override fun onRun() {
        val searchService = networkConnection.getRetrofit.create(SearchService :: class.java)
        val call = searchService.getEpisodes()
        val result = call.execute().body()
        Log.i("MESSAGE", "RESULTADO: " + result.toString())
    }

    override fun shouldReRunOnThrowable(throwable: Throwable?): Boolean {
        Log.i("MESSAGE", "THOWABLE")
        return false
    }

    override fun onAdded() {
        Log.i("MESSAGE", "ADDED")
    }

    override fun onCancel() {
        Log.i("MESSAGE", "CANCEL")
    }


}
