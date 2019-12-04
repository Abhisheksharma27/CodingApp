<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/JavascriptAdapter.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/JavascriptAdapter.kt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class JavascriptAdapter (var myContext: Context, var resource:Int, var items: List<JavascriptModel>)

    : ArrayAdapter<JavascriptModel>(myContext, resource, items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(myContext)

        val view: View = layoutInflater.inflate(resource, null)

        val contentTextView: TextView = view.findViewById(R.id.content_textView)
        var myItems: JavascriptModel = items[position]

        contentTextView.text= myItems.javascriptTitle

        return view
    }
}