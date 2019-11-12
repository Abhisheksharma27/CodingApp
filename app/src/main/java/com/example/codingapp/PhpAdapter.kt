package com.example.codingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class PhpAdapter (var mCtx: Context, var resource:Int, var items: List<PhpModel>)

    : ArrayAdapter<PhpModel>(mCtx, resource, items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

        val view: View = layoutInflater.inflate(resource, null)

        val contentTextView: TextView = view.findViewById(R.id.content_textView)
        var mItems: PhpModel = items[position]

        contentTextView.text= mItems.phpTitle

        return view
    }
}