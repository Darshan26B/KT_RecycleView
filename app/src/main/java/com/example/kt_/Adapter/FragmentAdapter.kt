package com.example.kt_.Adapter

import android.icu.text.CaseMap.Title
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentAdapter(fm: FragmentManager,Fragment:Array<Fragment>,Title:Array<String>) : FragmentPagerAdapter(fm) {
    var Title:Array<String> =Title
    var Fragment:Array<Fragment> = Fragment

    override fun getCount(): Int {
       return Fragment.size
    }

    override fun getItem(position: Int): Fragment {
          return Fragment.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return Title.get(position)
    }
}