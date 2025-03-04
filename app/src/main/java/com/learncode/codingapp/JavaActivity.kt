
package com.learncode.codingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class JavaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)

        var listView1 = findViewById<ListView>(R.id.java_listView)

        var list1 = mutableListOf<JavaModel>()

        //adding items to the list


        list1.add(JavaModel("Glossary"))
        list1.add(JavaModel("Quizzes"))
        list1.add(JavaModel("Updates Soon!!!"))

        //adapter

        listView1.adapter =JavaAdapter(this, R.layout.row_home, list1)

        //click listener
        listView1.setOnItemClickListener{parent, view, position, id ->


            if(position == 0){
                val j = Intent(applicationContext, JavaGlossary::class.java)
                startActivity(j)
            }

            if(position == 1){
                val j = Intent(applicationContext, JavaQuiz::class.java)
                startActivity(j)
            }

        }
    }
}
