package com.example.judah_ibook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_sign_up, container, false)
        view.btnSignUp.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToSecondSplashScreenFragment2) }
        return view
    }

}