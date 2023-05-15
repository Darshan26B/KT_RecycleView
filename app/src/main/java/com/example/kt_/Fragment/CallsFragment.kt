package com.example.kt_.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kt_.Adapter.Calls
import com.example.kt_.ModelClass
import com.example.kt_.R.drawable.*
import com.example.kt_.databinding.FragmentCallsBinding


class CallsFragment : Fragment() {
    var image= arrayOf(img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11)
    var Contact= arrayOf("1234567890","1234567890","1234567890","1234567890","1234567890","1234567890","1234567890","1234567890","1234567890","1234567890","1234567890")



    lateinit var binding: FragmentCallsBinding
    var CallList= ArrayList<ModelClass>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCallsBinding.inflate(layoutInflater)

        for (i in 0..image.size-1) {
            var data = ModelClass(image[i],Contact[i])
            CallList.add(data)
        }
        binding.rcvCalls.layoutManager= LinearLayoutManager(context)
        binding.rcvCalls.adapter= Calls(CallList)


        return binding.root
    }

}