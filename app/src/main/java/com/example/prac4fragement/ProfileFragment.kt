package com.example.prac4fragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_profile, container, false)

        val buttonBack = v.findViewById<View>(R.id.backButton)

        buttonBack.setOnClickListener(){
            activity!!.supportFragmentManager.popBackStack()
        }

        return v
    }
}