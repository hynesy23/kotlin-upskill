package com.example.kotlinupskill

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val util = StringUtility()
//        println(util.getAString())

        usernameSubmitBtn.setOnClickListener {
            var userName = userName.text.toString().uppercase()

            playerWelcomeMsgm.setText("Ahhh, so your name is $userName. Very well, $userName, let's see what adventures await!")
        }

        startBtn.setOnClickListener {
            println("I am pressed")
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}