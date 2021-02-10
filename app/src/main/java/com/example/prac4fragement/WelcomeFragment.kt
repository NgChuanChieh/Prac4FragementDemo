package com.example.prac4fragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
/*
// TODO: Rename parameter arguments, choose names that match, used for passing data between fragment
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
 */

class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_welcome, container, false)

        val buttonNext = v.findViewById<View>(R.id.buttonNext)

        buttonNext.setOnClickListener(){
            val profileFragment = ProfileFragment()
            activity!!.supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFrame, profileFragment)
                addToBackStack(null)
                commit()
            }
        }

        return v
    }

}