package com.example.adapterkotlen.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.adapterkotlen.R
import com.example.adapterkotlen.model.Member

class CustomAdapter(var contet:Context, var members : ArrayList<Member>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
     return members.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout,parent,false)
        return  MemberVievHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val member=members[position]
        if(holder is MemberVievHolder){
            val iv_image=holder.iv_image
            val tv_text=holder.tv_text

            iv_image.setImageResource(member.image)
            tv_text.setText(member.name)

        }
    }
    class MemberVievHolder( var view : View) :RecyclerView.ViewHolder(view){
        val iv_image :ImageView
        var tv_text :  TextView

        init {
            iv_image=view.findViewById(R.id.iv_image)
            tv_text=view.findViewById(R.id.tv_text)
        }

    }
}