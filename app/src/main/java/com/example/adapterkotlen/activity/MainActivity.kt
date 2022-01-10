package com.example.adapterkotlen.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapterkotlen.R
import com.example.adapterkotlen.adapter.CustomAdapter
import com.example.adapterkotlen.model.Member

class MainActivity : AppCompatActivity() {
    var context: Context ? =null
    var recyclerView :RecyclerView ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
          context=this
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView!!.setLayoutManager(GridLayoutManager(context,1))
        val members= ArrayList<Member>()
       for(i in 0..45){
           members.add(Member(R.drawable.ic_launcher_foreground,"Behruz  $i"))
       }
        refreshAdapter(members)
    }
    fun refreshAdapter(members: ArrayList<Member>){
        val adapter=CustomAdapter(context!!, members)
        recyclerView !!.adapter=adapter
    }
}