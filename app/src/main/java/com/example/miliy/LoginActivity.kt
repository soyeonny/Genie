package com.example.miliy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        // Sign Up Button 클릭시
        sign_up_btn1!!.setOnClickListener {
            // SignUpActivity 연결
            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            startActivity(intent)
        }


    }
}

