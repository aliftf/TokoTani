package com.shina.tokotani.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.shina.tokotani.R
import kotlinx.android.synthetic.main.fragment_signup_success.*

class SignupSuccessFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.`fragment_signup_success`, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnSignInNow.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signin,null)
        }
    }
}