package com.juanlucena.gokuapp.ui.search.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.juanlucena.gokuapp.MainApplication
import com.juanlucena.gokuapp.R
import com.juanlucena.gokuapp.models.Prueba
import com.juanlucena.gokuapp.tasks.jobs.AddPruebaJob
import com.juanlucena.gokuapp.tasks.jobs.CleanPruebaTableJob
import com.juanlucena.gokuapp.ui.search.adapters.AnimeListAdapter
import com.juanlucena.gokuapp.tasks.jobs.GetPruebaListJob
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.prueba_layout.*


class MainActivity : AppCompatActivity() {

    val animals : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prueba_layout)

        //addAnimals()
        val application = applicationContext as MainApplication

        showPruebasBtn.setOnClickListener {
            application.jobManager.addJobInBackground(GetPruebaListJob())
        }

        addPruebaBtn.setOnClickListener {
            val prueba = Prueba(1, pruebasEditText.text.toString())
            application.jobManager.addJobInBackground(AddPruebaJob(prueba))
        }

        deleteAllPruebasBtn.setOnClickListener {
            application.jobManager.addJobInBackground(CleanPruebaTableJob())
        }



        /*mainActivityList.layoutManager = LinearLayoutManager(this)
        mainActivityList.layoutManager = GridLayoutManager(this, 1)
        mainActivityList.adapter = AnimeListAdapter(animals, this)*/
    }

    /*fun addAnimals() {
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
    }*/
}
