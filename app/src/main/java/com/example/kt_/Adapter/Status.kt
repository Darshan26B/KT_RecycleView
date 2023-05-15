package com.example.kt_.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kt_.ModelClass
import com.example.kt_.R
import java.util.jar.Attributes.Name

class Status(StatusList:ArrayList<ModelClass>):RecyclerView.Adapter<Status.StatusHolder>() {
    lateinit var Context:Context
    var StatusList=StatusList

    class StatusHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image =itemView.findViewById<ImageView>(R.id.imgPhoto_Status)
        var Name=itemView.findViewById<TextView>(R.id.txtName_Status)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        Context=parent.context
        var View=LayoutInflater.from(parent.context).inflate(R.layout.status_item,parent,false)
        return StatusHolder(View)
    }

    override fun getItemCount(): Int {
       return StatusList.size
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        holder.image.setImageResource(StatusList.get(position).image)
        holder.Name.text=StatusList.get(position).Name
    }

}
