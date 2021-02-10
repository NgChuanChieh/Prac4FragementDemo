package com.example.prac4fragement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeFragment = WelcomeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFrame, welcomeFragment)
            commit()

        }
    }
}