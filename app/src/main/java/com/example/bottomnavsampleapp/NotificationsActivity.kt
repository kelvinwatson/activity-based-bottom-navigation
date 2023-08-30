package com.example.bottomnavsampleapp


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationBarView

class NotificationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        findViewById<NavigationBarView>(R.id.nav_view).apply {
            selectedItemId = R.id.navigation_notifications
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.navigation_notifications -> true

                    R.id.navigation_dashboard -> {
                        startActivityWithNavBarSharedTransition(
                            this@NotificationsActivity,
                            Intent(applicationContext, DashboardActivity::class.java)
                        )
                        true
                    }

                    R.id.navigation_home -> {
                        startActivityWithNavBarSharedTransition(
                            this@NotificationsActivity,
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