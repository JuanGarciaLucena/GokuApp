package com.juanlucena.gokuapp.models

data class Item(val id: Long, val title: String, val url: String)
data class Anime(val requestHash : String, val characterList : List<AnimeCharacter>)
data class AnimeCharacter(val malId : String, val url : String, val imageUrl : String, val characterName : String, val characterRole : String)
data class Episode(val request_hash : String, val request_cached : Boolean, val request_cache_expiry : Long, val episodes_last_page : Int)
data class MyEventMessage ( var message : String );