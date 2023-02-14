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


class MainOnboardingFragment : Fragment() {


    lateinit var binding: FragmentMainOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainOnboardingBinding.inflate(layoutInflater)
        initOnBoardingScreenViewPager()
        return binding.root
    }

    private fun initOnBoardingScreenViewPager(){
        binding.viewpage2.apply {
            this.adapter = ScreenSliderPagerFragment(requireActivity())
            this.orientation = ViewPager2.ORIENTATION_HORIZONTAL
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

    companion object{
        const val NO_OF_PAGES = 3
        val onBoardingFragments : ArrayList<Fragment> = arrayListOf(
            OnBoardingFragment1(),
            OnBoardingFragment2(),
            OnBoardingFragment3()
        )
    }

}