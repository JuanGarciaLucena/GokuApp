package com.juanlucena.gokuapp.ui.search.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.juanlucena.gokuapp.R
import com.juanlucena.gokuapp.ui.search.adapters.AnimeListAdapter
import com.juanlucena.gokuapp.di.DIManager
import com.juanlucena.gokuapp.objects.NetworkConnection
import com.juanlucena.gokuapp.services.SearchService
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var networkConnection: NetworkConnection

    val animals : ArrayList<String> = ArrayList()

    init {
        DIManager.getComponent().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addAnimals()

        val searchService = networkConnection.getRetrofit.create(SearchService :: class.java)
        val call = searchService.getEpisodes()
        val result = call.execute().body()
        //fsd

        mainActivityList.layoutManager = LinearLayoutManager(this)
        mainActivityList.layoutManager = GridLayoutManager(this, 1)
        mainActivityList.adapter = AnimeListAdapter(animals, this)

    }

    fun addAnimals() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")
    }
}
