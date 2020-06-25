package com.example.viewpagertest.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagertest.Model.User
import com.example.viewpagertest.R

class GridAdapter(private val country: ArrayList<String>) : RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val country = itemView.findViewById(R.id.country) as? TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.grid_cell,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return country.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val user = country[position]
        holder?.country?.text = user as CharSequence?
    }
}