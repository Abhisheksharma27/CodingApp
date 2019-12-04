<<<<<<< HEAD:app/src/main/java/info/learntocode/codingapp/PhpActivity.kt
package info.learntocode.codingapp
=======
<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/PhpActivity.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/PhpActivity.kt
>>>>>>> 3c3239577babc754f33ccf6f758ec90df27ef6d0:app/src/main/java/com/learntocode/codingapp/PhpActivity.kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.learncode.codingapp.R

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

        listView3.adapter = PhpAdapter(
            this,
            R.layout.row_home,
            list3
        )

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
