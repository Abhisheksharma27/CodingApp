package com.example.codingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import javax.annotation.Syntax

class javascriptActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_javascript)


        var listView4 = findViewById<ListView>(R.id.js_listView)

        var list4 = mutableListOf<JavascriptModel>()

        //adding items to the list

        list4.add(JavascriptModel("Glossary"))
        list4.add(JavascriptModel("Quizzes"))
        list4.add(JavascriptModel("Updates Soon!!!"))


        //adapter

        listView4.adapter =JavascriptAdapter(this, R.layout.row_home, list4)

        //click listener
        listView4.setOnItemClickListener{parent, view, position, id ->

            if(position == 0){
                val i = Intent(applicationContext, JavascriptGlossary::class.java)
                startActivity(i)
            }

            if(position == 1){
                val i = Intent(applicationContext, JavaScriptQuiz::class.java)
                startActivity(i)
            }

        }
    }
}
