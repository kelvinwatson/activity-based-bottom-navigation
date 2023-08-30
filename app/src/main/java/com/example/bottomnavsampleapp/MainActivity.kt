package com.example.bottomnavsampleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<NavigationBarView>(R.id.nav_view).apply {
            selectedItemId = R.id.navigation_home
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.navigation_notifications -> {
                        startActivityWithNavBarSharedTransition(
                            this@MainActivity,
                            Intent(applicationContext, NotificationsActivity::class.java)
                        )
                        true
                    }

                    R.id.navigation_dashboard -> {
                        startActivityWithNavBarSharedTransition(
                            this@MainActivity,
                            Intent(applicationContext, DashboardActivity::class.java)
                        )
                        true
                    }

                    R.id.navigation_home -> true
                    else -> false
                }
            }
        }
    }
}