package com.example.eventbookingapp.splash_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eventbookingapp.R
import kotlinx.coroutines.*

class SplashScreenFragment : Fragment() {



    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        GlobalScope.launch(Dispatchers.Main){
            delay(3000L)
            findNavController().navigate(R.id.action_splashScreenFragment_to_mainOnboardingFragment)
        }

        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }


}