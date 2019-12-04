package info.learntocode.codingapp

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
