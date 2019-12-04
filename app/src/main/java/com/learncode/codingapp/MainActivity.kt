package com.learncode.codingapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //inflate menu main to add items
 //2 overrides to display menu and handle menu events
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.getItemId()) {
            R.id.action_profile -> {
                startActivity(Intent(applicationContext, ProfileActivity::class.java))
                return true
            }

        }

        return super.onOptionsItemSelected(item)
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(toolbar)




        var listView = findViewById<ListView>(R.id.main_listView)

        var list = mutableListOf<Model>()

        //adding items to the list

        list.add(Model("Languages"))
        list.add(Model("Doubts"))
        list.add(Model("Useful Resources"))
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

            if(position == 2){
                val j = Intent(applicationContext, UsefulResources::class.java)
                startActivity(j)
            }
            if(position == 3){
                val k = Intent(applicationContext, AboutUsActivity::class.java)
                startActivity(k)
            }
        }
    }

}

