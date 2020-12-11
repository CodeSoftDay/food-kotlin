package com.hardsoftday.foodholic

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.size

class CustomAdapter(val img:Array<Int>, val name:Array<String>, val desc:Array<String>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        // Aca creamo el layout

        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_food_item, parent, false)
        return CustomViewHolder(v)

    }

    override fun getItemCount(): Int {
        return img.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindValue(img[position], name[position], desc[position])
    }

    class CustomViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindValue (image: Int, name:String, desc:String) {
            itemView.findViewById<ImageView>(R.id.imageView).setImageResource(image)
            itemView.findViewById<TextView>(R.id.text1).text = name
            itemView.findViewById<TextView>(R.id.text2).text = desc
        }

    }
}