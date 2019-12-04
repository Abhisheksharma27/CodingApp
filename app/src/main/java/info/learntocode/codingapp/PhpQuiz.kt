<<<<<<< HEAD:app/src/main/java/info/learntocode/codingapp/PhpQuiz.kt
package info.learntocode.codingapp
=======
<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/PhpQuiz.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/PhpQuiz.kt
>>>>>>> 3c3239577babc754f33ccf6f758ec90df27ef6d0:app/src/main/java/com/learntocode/codingapp/PhpQuiz.kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.learncode.codingapp.R
import kotlinx.android.synthetic.main.activity_java_quiz.*

class PhpQuiz : AppCompatActivity() {


    private val myPhpQuestions: PhpQuestions =
        PhpQuestions()
    private var mquestionView: TextView? = null
    private var mScoreView: TextView? = null
    private var optionButton1: Button? = null
    private var optionButton2: Button? = null
    private var optionButton3: Button? = null
    private var optionButton4: Button? = null
    private var mAnswer: String? = null
    private var mScore = 0
    private var mQuestionNumber = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_php_quiz)
        mScoreView = findViewById(R.id.score)
        mquestionView = findViewById(R.id.questionView)
        optionButton1 = findViewById(R.id.option1)
        optionButton2 = findViewById(R.id.option2)
        optionButton3 = findViewById(R.id.option3)
        optionButton4 = findViewById(R.id.option4)

        updateQuestion()

        /**
         * Handling logic for button click.
         */

        option1.setOnClickListener {

            if (optionButton1?.text === mAnswer) {
                mScore++
                updateScore(mScore)
                updateQuestion()
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
                updateQuestion()

            }
        }


        /**
         * button 2
         */

        option2.setOnClickListener {

            if (optionButton2?.text === mAnswer) {
                mScore++
                updateScore(mScore)
                updateQuestion()
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
                updateQuestion()

            }
        }


        /**
         * Button 3
         */



        option3.setOnClickListener {

            if (optionButton3?.text === mAnswer) {
                mScore++
                updateScore(mScore)
                updateQuestion()
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
                updateQuestion()

            }
        }



        /**
         * button 4
         */


        option4.setOnClickListener {

            if (optionButton4?.text === mAnswer) {
                mScore++
                updateScore(mScore)

                updateQuestion()
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
                updateQuestion()

            }

        }


        quit.setOnClickListener {
            val intent = Intent(applicationContext, PhpActivity::class.java )
            startActivity(intent)
            finish()
        }
    }


    fun updateQuestion() {
        mquestionView?.text = myPhpQuestions.getQuestion(mQuestionNumber)
        optionButton1?.text = myPhpQuestions.getChoice1(mQuestionNumber)
        optionButton2?.text = myPhpQuestions.getChoice2(mQuestionNumber)
        optionButton3?.text = myPhpQuestions.getChoice3(mQuestionNumber)
        optionButton4?.text = myPhpQuestions.getChoice4(mQuestionNumber)
        mAnswer = myPhpQuestions.getCorrectAnswer(mQuestionNumber)
        mQuestionNumber++
        if(mQuestionNumber === 5){
            val i = Intent(this, JavaQuizFinalActivity::class.java)
            startActivity(i)
            finish()
        }


    }

    private fun updateScore(point: Int) {
        mScoreView?.text = "" + mScore
    }
}
