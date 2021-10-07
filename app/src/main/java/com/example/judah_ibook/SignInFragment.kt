package com.example.judah_ibook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_sign_in.view.*

class SignInFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        view.btnSignIn.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToSecondSplashScreenFragment) }
        view.tvSetUpAccount.setOnClickListener { Navigation.findNavController(view).navigate(R.id.signUpFragment)}
        return view
    }


}