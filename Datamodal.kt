package com.example.articlesdemo

import android.media.Image
import android.media.MediaDescription





data class Datamodal(

    val status: String,



    val articles: List<Property>


)

data class Source(

    val id: String,
    val name: String

)

data class Property( val source:Source,
                     val author: String,
                     val title: String,
                     val description: String,
                     val urlToImage: String,
                     val url:String?,
                     val publishedAt :String?,
                     val content :String?


)