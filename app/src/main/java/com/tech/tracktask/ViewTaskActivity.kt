package com.tech.tracktask

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.AbsListView
import android.widget.ProgressBar
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ViewTaskActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var detailButton: CardView

    private var adapter: TaskListAdapter? = null
    private var taskList: ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_task)
        hideStatusBar()

        recyclerView = findViewById(R.id.recyclerView)
        detailButton = findViewById(R.id.detail)
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")
        taskList.add("A")



        initializeRecyclerView()

        detailButton.setOnClickListener{
            val intent = Intent(this@ViewTaskActivity, DetailTasks::class.java)
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

    private fun initializeRecyclerView() {

        recyclerView.layoutManager = GridLayoutManager(this@ViewTaskActivity, 2)
        adapter = TaskListAdapter(taskList)

        val layoutManager = recyclerView.layoutManager as GridLayoutManager
        recyclerView.adapter = adapter

    }
}