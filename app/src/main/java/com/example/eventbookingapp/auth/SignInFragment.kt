package com.example.eventbookingapp.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eventbookingapp.R
import com.example.eventbookingapp.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {


    lateinit var binding : FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignInBinding.inflate(layoutInflater)

        return binding.root
    }



    private fun initBindings(){

    }


}