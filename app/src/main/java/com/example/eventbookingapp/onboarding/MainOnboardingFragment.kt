package com.example.eventbookingapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.eventbookingapp.R
import com.example.eventbookingapp.databinding.FragmentMainOnboardingBinding
import com.example.eventbookingapp.onboarding.data.OnBoardingData
import com.google.android.material.tabs.TabLayoutMediator


class MainOnboardingFragment : Fragment() {


    lateinit var binding: FragmentMainOnboardingBinding
    var counter = 0

    var onBoardingDataList = arrayListOf(
        OnBoardingData(
            "Explore Upcoming and Nearby Events",
            "Come here and check if there are any events you may be interested in !"
        ),
        OnBoardingData(
            "We have Modern Events Calendar Feature",
            "Come and plan your events in our calendar feature specially catered for you !"
        ),
        OnBoardingData(
            "To Look Up More Events or Activities Nearby By Map",
            "Use our map features to check the events nearby you !"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainOnboardingBinding.inflate(layoutInflater)
        initOnBoardingScreenViewPager()
        binding.next.setOnClickListener {
            goNext()
        }
        return binding.root
    }

    private fun initOnBoardingScreenViewPager(){
        binding.viewpage2.apply {
            this.adapter = ScreenSliderPagerFragment(requireActivity())
            this.orientation = ViewPager2.ORIENTATION_HORIZONTAL
            TabLayoutMediator(binding.intoTabLayout,this){tab, position ->}.attach()
        }
    }


    private fun goNext(){
        binding.viewpage2.apply {
            if (this.currentItem == 2){
                setDataOnboarding(0)
                this.setCurrentItem(0,true)
            }else{
                setDataOnboarding(this.currentItem+1)
                this.setCurrentItem(this.currentItem+1,true)
            }
        }
    }

//    viewpager adapter
    private inner class ScreenSliderPagerFragment(fa : FragmentActivity) : FragmentStateAdapter(fa){
    override fun getItemCount(): Int {
        return NO_OF_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return onBoardingFragments.get(position)
    }


}


    private fun setDataOnboarding(position: Int){
        val data = onBoardingDataList[position]
        binding.title.text = data.title
        binding.subtitleMessage.text = data.subTitle
    }

    companion object{
        const val NO_OF_PAGES = 3
        val onBoardingFragments : ArrayList<Fragment> = arrayListOf(
            OnBoardingFragment1(),
            OnBoardingFragment2(),
            OnBoardingFragment3()
        )
    }

}