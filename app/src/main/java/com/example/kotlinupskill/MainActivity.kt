package com.example.kotlinupskill

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinupskill.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var newUser: Player
    private lateinit var binding: ActivityMainBinding
    lateinit var userName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_main)

//        val util = StringUtility()
//        println(util.getAString())

        binding.usernameSubmitBtn.setOnClickListener {
            userName = binding.userNameInput.text.toString()
            createMessage(userName)
            hideOpeningText()
            binding.playerName.text = "Name: ${userName.uppercase()}"
        }

        binding.startBtn.setOnClickListener {
            newUser = Player(userName)
            println("I am pressed ${newUser.userName}")
            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("userName", newUser.userName)
            intent.putExtra("user", newUser)
            startActivity(intent)
        }
//        Btn.setOnClickListener {
//            userName = userNameInput.text.toString()
//            newUser = Player(userName)
//            val message = getString(R.string.player_welcome_msg, userName.uppercase(), userName.uppercase())
//            playerWelcomeMsg.text = message
//            name_container.visibility = GONE
//
//            playerName.text = "Name: ${userName.uppercase()}"
//        }
//
//        startBtn.setOnClickListener {
//            println("I am pressed ${newUser.userName}")
//            val intent = Intent(this, SecondActivity::class.java)
////            intent.putExtra("userName", newUser.userName)
//            intent.putExtra("user", newUser)
//            startActivity(intent)
//        }
    }

    private fun createMessage(userName: String) {
        val message = getString(R.string.player_welcome_msg, userName.uppercase(), userName.uppercase())
        binding.playerWelcomeMsg.text = message
    }

    private fun hideOpeningText() {
        binding.nameContainer.visibility = View.GONE
        binding.textView3.visibility = View.GONE
    }
}