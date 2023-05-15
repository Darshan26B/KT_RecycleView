package com.example.kt_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kt_.Fragment.CallsFragment
import com.example.kt_.Fragment.ChatsFragment
import com.example.kt_.Adapter.FragmentAdapter
import com.example.kt_.Fragment.StatusFragment
import com.example.kt_.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var Title: Array<String> = arrayOf("Chats", "Status", "Calls")
    var Fragment: Array<Fragment> = arrayOf(ChatsFragment(), StatusFragment(), CallsFragment())

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.VP.adapter = FragmentAdapter(supportFragmentManager, Fragment, Title)
        binding.TL.setupWithViewPager(binding.VP)
    }
}
