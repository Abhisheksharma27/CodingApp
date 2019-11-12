package com.example.codingapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var listView = findViewById<ListView>(R.id.main_listView)

        var list = mutableListOf<Model>()

        //adding items to the list

        list.add(Model("Languages"))
        list.add(Model("Doubts"))
        list.add(Model("Join Us"))
        list.add(Model("About Us"))

        //adapter

        listView.adapter = MyHomeAdapter(this, R.layout.row_home, list)

        //click listener
        listView.setOnItemClickListener{parent, view, position, id ->
            if(position == 0){
                val i = Intent(applicationContext, ProgrammingLanguage::class.java)
                startActivity(i)
            }
            if(position == 1){
                val j = Intent(applicationContext, DoubtActivity::class.java)
                startActivity(j)
            }
        }
    }

}

