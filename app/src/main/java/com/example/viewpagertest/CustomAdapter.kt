package com.example.viewpagertest

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

private val EMPTY_ITEM = 0
private val NORMAL_ITEM = 1

class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById(R.id.textVeiw) as? TextView
        val address = itemView.findViewById(R.id.textView2) as? TextView
        val itemList = itemView.findViewById(R.id.itemList) as? LinearLayout
    }
    inner class EmptyMyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById(R.id.txtName) as? TextView
        val address = itemView.findViewById(R.id.txtAddress) as? TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
       return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val user: User = userList[position]
        holder?.name?.text = user.name + position.toString()
        holder?.address?.text = user.address
        holder?.itemList?.setOnClickListener {
            Log.d("111","my name is khan")
        }
    }
}