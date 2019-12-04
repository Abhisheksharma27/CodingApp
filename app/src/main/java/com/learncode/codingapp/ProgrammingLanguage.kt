
package com.learncode.codingapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_programming_language.*

class ProgrammingLanguage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programming_language)

        javaLayout.setOnClickListener{
            val java = Intent(applicationContext, JavaActivity::class.java)
            startActivity(java)
        }

        htmlLayout.setOnClickListener{
            val html = Intent(applicationContext, HtmlActivity::class.java)
            startActivity(html)
        }

        javascriptLayout.setOnClickListener{
            val javascript = Intent(applicationContext, javascriptActivity::class.java)
            startActivity(javascript)
        }

        phpLayout.setOnClickListener{
            val php = Intent(applicationContext, PhpActivity::class.java)
            startActivity(php)
        }
    }
}
