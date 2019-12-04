package com.learncode.codingapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class PhpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_php)

        var listView3 = findViewById<ListView>(R.id.php_listView)

        var list3 = mutableListOf<PhpModel>()

        //adding items to the list


        list3.add(PhpModel("Glossary"))
        list3.add(PhpModel("Quizzes"))
        list3.add(PhpModel("Updates Soon!!!"))


        //adapter

        listView3.adapter =PhpAdapter(this, R.layout.row_home, list3)

        //click listener
        listView3.setOnItemClickListener{parent, view, position, id ->

            if(position == 0){
                val i = Intent(applicationContext, PhpGlossary::class.java)
                startActivity(i)
            }

            if(position == 1){
                val i = Intent(applicationContext, PhpQuiz::class.java)
                startActivity(i)
            }

        }
    }
}
