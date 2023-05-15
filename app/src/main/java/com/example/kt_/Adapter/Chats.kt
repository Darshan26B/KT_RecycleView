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

class Chats(ChatsList:ArrayList<ModelClass>):RecyclerView.Adapter<Chats.ChatsHolder>() {
        lateinit var Context:Context
        var ChatsList=ChatsList

    class ChatsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image=itemView.findViewById<ImageView>(R.id.imgPhoto_Chats)
        var Name=itemView.findViewById<TextView>(R.id.txtName_Chats)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsHolder {
        Context=parent.context
        var View = LayoutInflater.from(parent.context).inflate(R.layout.chats_item,parent,false)
        return ChatsHolder(View)
    }

    override fun getItemCount(): Int {
        return ChatsList.size
    }

    override fun onBindViewHolder(holder: ChatsHolder, position: Int) {
        holder.image.setImageResource(ChatsList.get(position).image)
        holder.Name.text=ChatsList.get(position).Name

    }
}