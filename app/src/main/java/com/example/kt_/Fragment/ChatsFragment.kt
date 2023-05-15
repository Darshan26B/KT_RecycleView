package com.example.kt_.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kt_.Adapter.Chats
import com.example.kt_.ModelClass
import com.example.kt_.R.drawable.*
import com.example.kt_.databinding.FragmentChatsBinding


class ChatsFragment : Fragment() {
    var image= arrayOf(img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11)
    var Name= arrayOf("A","B","C","D","E","F","G","H","I","J","K")


    var ChatsList=ArrayList<ModelClass>()
    lateinit var binding:FragmentChatsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= FragmentChatsBinding.inflate(layoutInflater)
        for (i in 0..image.size-1) {
            var data = ModelClass(image[i],Name[i])
            ChatsList.add(data)
        }
        binding.rcvChats.layoutManager=LinearLayoutManager(context)
        binding.rcvChats.adapter= Chats(ChatsList)

        return binding.root
    }


}