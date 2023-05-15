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

class Calls(CallsList:ArrayList<ModelClass>):RecyclerView.Adapter<Calls.CallsHolder>() {
    lateinit var Context:Context
    var CallsList=CallsList
    class CallsHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image=itemView.findViewById<ImageView>(R.id.imgPhoto_Calls)
        var Contact=itemView.findViewById<TextView>(R.id.txtContact_Calls)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsHolder {
        Context=parent.context
        var View=LayoutInflater.from(parent.context).inflate(R.layout.calls_item,parent,false)
        return CallsHolder(View)
    }

    override fun getItemCount(): Int {
        return CallsList.size
    }

    override fun onBindViewHolder(holder: CallsHolder, position: Int) {
        holder.image.setImageResource(CallsList.get(position).image)
        holder.Contact.text=CallsList.get(position).Name
    }
}