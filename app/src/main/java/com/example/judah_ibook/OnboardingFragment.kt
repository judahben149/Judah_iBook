package com.example.judah_ibook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_onboarding.view.*


class OnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_onboarding, container, false)
        view.btnOnboarding.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToSignInFragment) }

        return view
    }


}