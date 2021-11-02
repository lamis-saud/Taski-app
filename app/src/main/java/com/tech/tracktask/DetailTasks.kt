package com.tech.tracktask

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailTasks : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var detailButton: CardView

    private var adapter: DetailListAdapter? = null
    private var taskList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tasks)

        hideStatusBar()

        recyclerView = findViewById(R.id.recyclerView)

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

        recyclerView.layoutManager = GridLayoutManager(this@DetailTasks, 2)
        adapter = DetailListAdapter(taskList)

        val layoutManager = recyclerView.layoutManager as GridLayoutManager
        recyclerView.adapter = adapter

    }
}
