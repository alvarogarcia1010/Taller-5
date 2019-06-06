package com.agarcia.navigationcomponent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.agarcia.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_three.*

class FragmentThree : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        three_btn_next_action.setOnClickListener {
            val nextAction = FragmentThreeDirections.nextAction()
            Navigation.findNavController(it).navigate(nextAction)
        }

        three_btn_home_action.setOnClickListener {
            val homeAction = FragmentThreeDirections.homeAction()
            Navigation.findNavController(it).navigate(homeAction)
        }
    }
}
