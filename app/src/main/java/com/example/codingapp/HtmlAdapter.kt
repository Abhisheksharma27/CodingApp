package com.example.codingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class HtmlAdapter (var mCtx: Context, var resource:Int, var items: List<HtmlModel>)

    : ArrayAdapter<HtmlModel>(mCtx, resource, items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

        val view: View = layoutInflater.inflate(resource, null)

        val contentTextView: TextView = view.findViewById(R.id.content_textView)
        var mItems: HtmlModel = items[position]

        contentTextView.text= mItems.htmlTitle

        return view
    }
}