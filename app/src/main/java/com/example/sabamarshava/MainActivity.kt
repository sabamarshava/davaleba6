package com.example.sabamarshava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sabamarshava.adapters.gangadapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        var gang = ArrayList<gang>()



        gang.add(gang("https://diplomats.pl/wp-content/uploads/2016/03/Mikheil_Saakashvili.jpg"))

        val adapter= gangadapter(gang)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}