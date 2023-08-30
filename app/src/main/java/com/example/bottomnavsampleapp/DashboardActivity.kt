package com.example.bottomnavsampleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationBarView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        findViewById<NavigationBarView>(R.id.nav_view).apply {
            selectedItemId = R.id.navigation_dashboard
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.navigation_notifications -> {
                        startActivityWithNavBarSharedTransition(
                            this@DashboardActivity,
                            Intent(applicationContext, NotificationsActivity::class.java)
                        )
                        true
                    }

                    R.id.navigation_dashboard -> true

                    R.id.navigation_home -> {
                        startActivityWithNavBarSharedTransition(
                            this@DashboardActivity,
                            Intent(applicationContext, MainActivity::class.java)
                        )
                        true
                    }

                    else -> false
                }
            }
        }
    }
}