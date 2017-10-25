package com.example.ruitermatos.cleanlogin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ruitermatos.signup.presentation.ActivitySignUp
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            startActivity(Intent(this, ActivitySignUp::class.java))
        }
    }
}
