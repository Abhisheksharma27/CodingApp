package com.example.codingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.android.synthetic.main.activity_doubts_list.*

class DoubtsListActivity : AppCompatActivity() {

    var db = FirebaseFirestore.getInstance()

    //adding the adapter to read the data here.
    private var adapter: DoubtAdapter? =null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doubts_list)


        recyclerViewDoubts.setLayoutManager(LinearLayoutManager(this))

        //query

        val query = db.collection("doubts").orderBy("doubtId", Query.Direction.ASCENDING)

        //pass the query results to the recycler adapter

        val options = FirestoreRecyclerOptions.Builder<DoubtModel>().setQuery(query, DoubtModel::class.java).build()

        adapter = DoubtAdapter(options)

        recyclerViewDoubts.adapter=adapter
    }

    //inner classes to read and bind the data

    private inner class DoubtViewHolder internal constructor(private val view: View) : RecyclerView.ViewHolder(view){

        internal fun displayDoubt(doubtDescription: String, languageDoubt: String) {
            //populating our template file now here.

            val textViewDoubt = view.findViewById<TextView>(R.id.textViewDoubt)
            val textViewLang = view.findViewById<TextView>(R.id.textViewLang)

            textViewDoubt.text= doubtDescription
            textViewLang.text= languageDoubt

        }
    }


    // start listening for changes if the the activity starts / restarts
    override fun onStart() {
        super.onStart()
        adapter!!.startListening()
    }

    // stop listening for data changes if the activity gets stopped
    override fun onStop() {
        super.onStop()
        adapter!!.stopListening()
    }


    private inner class DoubtAdapter internal constructor(options: FirestoreRecyclerOptions<DoubtModel>) : FirestoreRecyclerAdapter<DoubtModel,
            DoubtViewHolder>(options){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoubtViewHolder {

            //instantiate the list here.

            val view= LayoutInflater.from(parent.context).inflate(R.layout.item_doubt, parent, false)
            return DoubtViewHolder(view)

        }

        override fun onBindViewHolder(p0: DoubtViewHolder, p1: Int, p2: DoubtModel) {

            //pass the current values
            p0.displayDoubt(p2.doubtDescription.toString(), p2.languageDoubt.toString())

        }

    }
}
