<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/ProgrammingLanguage.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/ProgrammingLanguage.kt

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
