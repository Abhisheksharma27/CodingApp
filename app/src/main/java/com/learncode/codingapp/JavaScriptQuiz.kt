
package com.learncode.codingapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_java_quiz.*

class JavaScriptQuiz : AppCompatActivity(){

    private val myJsQuestions: JavaScriptQuestions = JavaScriptQuestions()
    private var mquestionView: TextView? = null
    private var mScoreView: TextView? = null
    private var optionButton1: Button? = null
    private var optionButton2: Button? = null
    private var optionButton3: Button? = null
    private var optionButton4: Button? = null
    private var mAnswer: String? = null
     var mScore = 0
    private var mQuestionNumber = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html_quiz)
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
            val intent = Intent(applicationContext, HtmlActivity::class.java )
            startActivity(intent)
            finish()
        }

    }


    fun updateQuestion() {
        mquestionView?.text = myJsQuestions.getQuestion(mQuestionNumber)
        optionButton1?.text = myJsQuestions.getChoice1(mQuestionNumber)
        optionButton2?.text = myJsQuestions.getChoice2(mQuestionNumber)
        optionButton3?.text = myJsQuestions.getChoice3(mQuestionNumber)
        optionButton4?.text = myJsQuestions.getChoice4(mQuestionNumber)
        mAnswer = myJsQuestions.getCorrectAnswer(mQuestionNumber)
        mQuestionNumber++
        if(mQuestionNumber === 5){
            val i = Intent(this, JavaQuizFinalActivity::class.java)
            startActivity(i)
            finish()
        }


    }

    fun updateScore(point: Int) {
        mScoreView?.text = "" + mScore
    }
}