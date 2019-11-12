package com.example.codingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
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
   // private var adapter: DoubtAdapter? =null

    private var doubtList = mutableListOf<DoubtModel>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doubts_list)


        recyclerViewDoubts.setLayoutManager(LinearLayoutManager(this))

        //query

        val query = db.collection("doubts").orderBy("orderId", Query.Direction.ASCENDING)


    }

    //inner classes to read and bind the data

    private inner class DoubtViewHolder internal constructor(private val view: View) : RecyclerView.ViewHolder(view){

    }





    private inner class DoubtAdapter internal constructor(options: FirestoreRecyclerOptions<DoubtModel>) : FirestoreRecyclerAdapter<DoubtModel,
            DoubtViewHolder>(options){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoubtViewHolder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onBindViewHolder(p0: DoubtViewHolder, p1: Int, p2: DoubtModel) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}
