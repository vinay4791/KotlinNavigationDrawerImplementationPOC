package com.example.vinayjohn.kotlinnavigationdrawerimplementationpoc

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ShareFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ShareFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShareFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_share, container, false)
    }

}// Required empty public constructor
