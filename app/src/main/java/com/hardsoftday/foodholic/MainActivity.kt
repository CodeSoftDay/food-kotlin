   package com.hardsoftday.foodholic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

   class MainActivity : AppCompatActivity() {

       private val img = arrayOf(R.drawable.a, R.drawable.b, R.drawable.c,
           R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g)

       private val name = arrayOf("Pizza", "Pizza", "Pizza", "Pizza", "Pizza", "Pizza", "Pizza")

       private val desc = arrayOf("Pizza con queso", "Pizza con queso", "Pizza con queso", "Pizza con queso",
           "Pizza con queso", "Pizza con queso", "Pizza con queso")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerFood)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img, name, desc)

    }
}