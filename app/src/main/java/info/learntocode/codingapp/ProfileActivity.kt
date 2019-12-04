package info.learntocode.codingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.learncode.codingapp.R
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
