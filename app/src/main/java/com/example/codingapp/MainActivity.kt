package com.example.codingapp

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listView)
        //adding the adapter for my listview

        listView.adapter = MyCustomAdapter(this)
    }

    /**
     * base adapter acts as my constructor the application.
     */
    private class MyCustomAdapter(context: Context): BaseAdapter() {

        private val mContext: Context


        private val content = arrayListOf(
            "Languages", "Ask your Doubts", "Join our Team", "About Us"
        )

        init{
            mContext = context
        }
        //for rendering the rows for app
        @SuppressLint("ViewHolder")
        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
           val rowHome =  layoutInflater.inflate(R.layout.row_home, p2, false)

            val contentTextView = rowHome.findViewById<TextView>(R.id.content_textView)
            contentTextView.text = content[p0]
            return rowHome
//            val textView = TextView(mContext)
//            textView.text = "Testing the feature"
//            return textView
        }

        override fun getItem(p0: Int): Any {
           return "Ab" //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()

        }

        //will be handling the number of rows in my list
        override fun getCount(): Int {
            return content.size //To change body of created functions use File | Settings | File Templates.
        }
    }
}

