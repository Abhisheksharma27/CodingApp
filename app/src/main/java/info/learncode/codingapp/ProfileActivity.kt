<<<<<<< HEAD:app/src/main/java/com/learncode/codingapp/ProfileActivity.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/main/java/com/learntocode/codingapp/ProfileActivity.kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val user = FirebaseAuth.getInstance().currentUser

        user?.let {
            val name = user.displayName
            val email = user.email



            textViewName.text = name
            textViewEmail.text = email
        }
    }

        override fun onStart(){
            super.onStart()

            //check for authenticated user

            val user = FirebaseAuth.getInstance().currentUser

            if(user == null){
                val intent = Intent(applicationContext, SignInActivity::class.java)
                startActivity(intent)
            }






        }






}
