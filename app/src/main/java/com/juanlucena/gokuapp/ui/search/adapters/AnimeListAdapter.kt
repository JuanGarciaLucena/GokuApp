package com.juanlucena.gokuapp.ui.search.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juanlucena.gokuapp.R
import kotlinx.android.synthetic.main.anime_list_item.view.*

class AnimeListAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<AnimeListAdapter.ViewHolder>() {



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvAnimalType?.text = items.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.anime_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val tvAnimalType = view.mainListItemLabel
    }

}