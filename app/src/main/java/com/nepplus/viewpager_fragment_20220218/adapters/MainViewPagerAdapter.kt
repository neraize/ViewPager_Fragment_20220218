package com.nepplus.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager_fragment_20220218.fragments.*

class MainViewPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

/*        if(position == 0){
            return NameFragment()
        }
        else if(position == 1){
            return BirthYearFragment()
        }
        else if(position == 2){
            return HelloFragment()
        }
        else if(position == 3){
            return Etc1Fragment()
        }
        else{
            return Etc2Fragment()
        }*/

/*        when(position){
            0 -> {return NameFragment()}
            1 -> return BirthYearFragment()
            2 -> return HelloFragment()
            3 -> return Etc1Fragment()
            else -> return Etc2Fragment()
        }*/

        return when(position){
            0 -> NameFragment()
            1 -> BirthYearFragment()
            2 ->  HelloFragment()
            3 -> Etc1Fragment()
            else -> Etc2Fragment()
        }


    }

}