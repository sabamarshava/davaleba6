package com.example.sabamarshava.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sabamarshava.R
import com.example.sabamarshava.gang

class gangadapter (private val btugang: List<gang>) : RecyclerView.Adapter<gangadapter.gangViewHolder>(){
    class gangViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val  imageview: ImageView = itemView.findViewById(R.id.imageView)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): gangViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.recyclerviewscroll_activity,parent,false)
        return gangViewHolder(view)
    }


    override fun onBindViewHolder(holder: gangViewHolder, position: Int) {
        val a = btugang[position]
        Glide.with(holder.imageview.context)
            .load(a.https)
            .centerCrop()
            .into(holder.imageview)



    }

    override fun getItemCount(): Int = btugang.size


}