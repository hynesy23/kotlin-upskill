package com.example.kotlinupskill

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinupskill.databinding.ActivitySecondBinding

//import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

//    private val awesomeOnClickListener: View.OnClickListener = View.OnClickListener { selectType() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root

        val user = intent.getParcelableExtra<Player>("user")

        setContentView(view)

        generateWelcomeMsg(user)

        binding.typeSubmitBtn.setOnClickListener{
            println("I HAVE BEEN PRESSED!")
            if (binding.checkboxWater.isChecked) {
            println("I AM WATER TYPE")
                user?.setType("water")

            }
            if (binding.checkboxFire.isChecked) {
                println("I AM FIRE TYPE")
                user?.setType("fire")
            }
            if (binding.checkboxWind.isChecked) {
                println("I AM WIND TYPE")
                user?.setType("wind")
            }
        }
    }

    private fun generateWelcomeMsg(user: Player?) {
//        val userName = intent.extras!!.getString("userName")
//        println("My name is $userName")
//        val message = getString(R.string.second_welcome, userName)l userName = intent.extras!!.getString("userName")
//        val user = intent.getParcelableExtra<Player>("user")
        println("My name is ${user?.userName}")
        val message = getString(R.string.second_welcome, user?.userName)
        binding.secondWelcomeMsg.text = message
    }
}