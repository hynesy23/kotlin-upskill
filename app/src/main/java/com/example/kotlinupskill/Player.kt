package com.example.kotlinupskill

import android.os.Parcelable
import android.util.Log
import kotlinx.android.parcel.Parcelize
//import kotlinx.parcelize


@Parcelize
class Player(private val username: String = "Player 1"): Parcelable {

    private val levels = arrayOf("Novice", "Amateur", "Intermediate", "Professional", "Great", "Legend")
    private var currentLevel = levels[0]
    private var type = ""
    var levelScore = 0

    private fun setCurrentLevel(s: String) {
        println("setCurrentLevel() called")
        currentLevel = if(s == "increase") {
            levels[levels.indexOf(currentLevel) + 1]
        } else {
            levels[levels.indexOf(currentLevel) - 1]
        }
    }

    fun printUserName() {
        println("Username: $username")
    }

    fun setType(type: String) {
        println("setType() called")
        if(type == "water") {
            this.type = "water"
        }
        if(type == "fire") {
            this.type = "fire"
        }
        if(type == "wind") {
            this.type = "wind"
        }
        Log.i("type", this.type)
    }

    public fun increaseLevelScore() {
        println("increaseLevelScore() called")
        this.levelScore += 1
        if(levelScore % 3 == 0) {
            this.setCurrentLevel("increase")
        }
    }

    public fun decreaseLevelScore() {
        println("decreaseLevelScore() called")
        this.levelScore -= 1
        if(levelScore % 3 != 0) {
            setCurrentLevel("decrease")
        }
    }
}

//class Player implements Parcelable {
//
//    public Player(username: String) {
//        val userName = username
//        private val levels = arrayOf("Novice", "Amateur", "Intermediate", "Professional", "Great", "Legend")
//        private var currentLevel = levels[0]
//        private var type = ""
//        var levelScore = 0
//
//        //    fun showWelcomeMessage(): String {
//        //        val message = getString(R.string.player_welcome_msg)
//        //    }
//
//        private fun setCurrentLevel(s: String) {
//            println("setCurrentLevel() called")
//            currentLevel = if(s == "increase") {
//                levels[levels.indexOf(currentLevel) + 1]
//            } else {
//                levels[levels.indexOf(currentLevel) - 1]
//            }
//        }
//
//        fun setType(type: String) {
//            println("setType() called")
//            if(type == "water") {
//                this.type = "water"
//            }
//            if(type == "fire") {
//                this.type = "fire"
//            }
//            if(type == "wind") {
//                this.type = "wind"
//            }
//        }
//
//        fun increaseLevelScore() {
//            println("increaseLevelScore() called")
//            this.levelScore += 1
//            if(levelScore % 3 == 0) {
//                this.setCurrentLevel("increase")
//            }
//        }
//
//        fun decreaseLevelScore() {
//            println("decreaseLevelScore() called")
//            this.levelScore -= 1
//            if(levelScore % 3 != 0) {
//                setCurrentLevel("decrease")
//            }
//        }
//    }
//
//}