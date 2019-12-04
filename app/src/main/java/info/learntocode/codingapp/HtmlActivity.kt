package info.learntocode.codingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.learncode.codingapp.R

class HtmlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html)
        var listView2 = findViewById<ListView>(R.id.html_listView)

        var list2 = mutableListOf<HtmlModel>()

        //adding items to the list

        //list2.add(HtmlModel("Syntax"))
        list2.add(HtmlModel("Glossary"))
        list2.add(HtmlModel("Quizzes"))
        list2.add(HtmlModel("Updates coming!!!!"))

        //adapter

        listView2.adapter = HtmlAdapter(
            this,
            R.layout.row_home,
            list2
        )

        //click listener
        listView2.setOnItemClickListener{parent, view, position, id ->

            if(position == 0){
                val i = Intent(applicationContext, HtmlGlossary::class.java)
                startActivity(i)
            }


            if(position == 1){
                val i = Intent(applicationContext, HtmlQuiz::class.java)
                startActivity(i)
            }

        }
    }
}
