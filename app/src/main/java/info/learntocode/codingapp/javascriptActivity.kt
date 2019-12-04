<<<<<<< HEAD:app/src/main/java/info/learntocode/codingapp/javascriptActivity.kt
package info.learntocode.codingapp
=======
<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/javascriptActivity.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/javascriptActivity.kt
>>>>>>> 3c3239577babc754f33ccf6f758ec90df27ef6d0:app/src/main/java/com/learntocode/codingapp/javascriptActivity.kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.learncode.codingapp.R

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

        listView4.adapter = JavascriptAdapter(
            this,
            R.layout.row_home,
            list4
        )

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
