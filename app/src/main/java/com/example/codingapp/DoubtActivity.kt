package com.example.codingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_doubt.*


class DoubtActivity : AppCompatActivity() {

    var db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doubt)


        //submit button utility

        buttonSubmit.setOnClickListener{
             //getting th input from users
            val doubtDesc = editTextDoubt.text.toString()
            //validation so it is not empty

            if(TextUtils.isEmpty(doubtDesc)){
                Toast.makeText(this, "Please enter the doubt", Toast.LENGTH_LONG).show()
            }
            else{
                val languageDoubt = spinnerLanguage.selectedItem.toString()

                //getting doc with id
                val tbl = db.collection("doubts")
                val doubtId = tbl.document().getId()


                //create and populate using our doubtModel class

                val doubt = DoubtModel(doubtId, doubtDesc, languageDoubt)

                //save to the database

                tbl.document().set(doubt)

                //resetting after submission

                editTextDoubt.setText("")
                spinnerLanguage.setSelection(0)
                Toast.makeText(this, "We have received your query, we will reply soon.", Toast.LENGTH_LONG).show()

            }
        }

        buttonViewAll.setOnClickListener{
            val k = Intent(applicationContext, DoubtsListActivity::class.java)
            startActivity(k)
        }
    }


}
