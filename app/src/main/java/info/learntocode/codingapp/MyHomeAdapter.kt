package info.learntocode.codingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.learncode.codingapp.R

class MyHomeAdapter(var myContext: Context, var resource:Int, var items: List<Model>)
    :ArrayAdapter<Model>(myContext, resource, items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(myContext)

        val view:View = layoutInflater.inflate(resource, null)

        val contentTextView: TextView = view.findViewById(R.id.content_textView)
        var myItems: Model = items[position]

        contentTextView.text= myItems.title

        return view
    }

}