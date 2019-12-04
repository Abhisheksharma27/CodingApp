package com.learntocode.codingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class JavaAdapter (var myContext: Context, var resource:Int, var items: List<JavaModel>)

    : ArrayAdapter<JavaModel>(myContext, resource, items)
{

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(myContext)

        val view: View = layoutInflater.inflate(resource, null)

        val contentTextView: TextView = view.findViewById(R.id.content_textView)
        var myItems: JavaModel = items[position]

        contentTextView.text= myItems.javaTitle

        return view
    }

}