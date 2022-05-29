package com.androiddevs.mvvmnewsapp.ui.splashscreenkotlin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.androiddevs.mvvmnewsapp.ui.NewsActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val time : Long = 2000

        Handler().postDelayed(Runnable {
            val intent = Intent(Splashscreen@this, NewsActivity::class.java)
            startActivity(intent)
            finish()
        }, time)


    }
}