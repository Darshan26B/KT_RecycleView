package com.example.kt_.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kt_.Adapter.Status
import com.example.kt_.ModelClass
import com.example.kt_.R.drawable.*
import com.example.kt_.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {
    var image= arrayOf(img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11)
    var Name= arrayOf("A","B","C","D","E","F","G","H","I","J","K")

    var StatusList= ArrayList<ModelClass>()

    lateinit var binding: FragmentStatusBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStatusBinding.inflate(layoutInflater)

        for (i in 0..image.size-1) {
            var data =ModelClass(image[i],Name[i])
            StatusList.add(data)
        }
        binding.rcvStatus.layoutManager=LinearLayoutManager(context)
        binding.rcvStatus.adapter= Status(StatusList)


        return binding.root
    }
}