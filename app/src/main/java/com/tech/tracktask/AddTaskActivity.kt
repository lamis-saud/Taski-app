package com.tech.tracktask

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.cardview.widget.CardView

class AddTaskActivity : AppCompatActivity() {
    lateinit var saveTask:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
        hideStatusBar()

        saveTask = findViewById(R.id.savetask)

        saveTask.setOnClickListener{
            val intent = Intent(this@AddTaskActivity, ViewTaskActivity::class.java)
            startActivity(intent)
        }

    }

    fun hideStatusBar() {
        if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        } else {
            val decorView: View = window.decorView
            val uiOptions: Int = View.SYSTEM_UI_FLAG_FULLSCREEN
            decorView.setSystemUiVisibility(uiOptions)
        }
    }
}