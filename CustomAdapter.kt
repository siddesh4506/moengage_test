package com.example.articlesdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class MyAdapter(private val datamodal: Datamodal) : RecyclerView.Adapter<MyAdapter.MyViewHolder>()  {

    class MyViewHolder(val view: View): RecyclerView.ViewHolder(view){

        fun bind(Datamodal:Datamodal){
            val title = view.findViewById<TextView>(R.id.tvTitle)
            val imageView = view.findViewById<ImageView>(R.id.imageView)
            val description = view.findViewById<TextView>(R.id.tvDescription)

            title.text = Datamodal.articles.get(position).title

            description.text = Datamodal.articles.get(position).publishedAt

            Glide.with(view.context).load(Datamodal.articles.get(position).urlToImage).centerCrop().into(imageView)

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rvadapter, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return datamodal.articles.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(datamodal)
    }


}
