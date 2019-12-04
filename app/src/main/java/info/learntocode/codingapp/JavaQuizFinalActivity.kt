<<<<<<< HEAD:app/src/main/java/info/learntocode/codingapp/JavaQuizFinalActivity.kt
package info.learntocode.codingapp
=======
<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/JavaQuizFinalActivity.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/JavaQuizFinalActivity.kt
>>>>>>> 3c3239577babc754f33ccf6f758ec90df27ef6d0:app/src/main/java/com/learntocode/codingapp/JavaQuizFinalActivity.kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learncode.codingapp.R
import kotlinx.android.synthetic.main.activity_java_quiz_final.*

class JavaQuizFinalActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_quiz_final)




        buttonBackToMenu.setOnClickListener {
            val i = Intent(this, ProgrammingLanguage::class.java)
            startActivity(i)
            finish()
        }
    }
}
