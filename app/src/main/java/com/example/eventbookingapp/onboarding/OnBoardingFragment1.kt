package com.example.eventbookingapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eventbookingapp.R
import com.example.eventbookingapp.databinding.FragmentOnBoarding1Binding


class OnBoardingFragment1 : Fragment() {

    lateinit var binding : FragmentOnBoarding1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOnBoarding1Binding.inflate(layoutInflater)

        return binding.root
    }


}