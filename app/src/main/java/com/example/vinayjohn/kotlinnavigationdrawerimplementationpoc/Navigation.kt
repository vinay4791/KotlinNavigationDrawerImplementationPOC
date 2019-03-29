package com.example.vinayjohn.kotlinnavigationdrawerimplementationpoc

import android.support.annotation.IdRes
import android.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by vinayjohn on 29/03/19.
 */


/*
Extension function written to replce the fragment in a particular view.
for eg : In this project we are replacing the main_contect FrameLayouts content with the specified fragment
 */
fun AppCompatActivity.replaceFragmentBy(fragment: Fragment,
                                        allowStateLoss: Boolean = false,
                                        @IdRes containerViewId: Int) {
    val ft = fragmentManager
            .beginTransaction()
            .replace(containerViewId, fragment)
    if (!supportFragmentManager.isStateSaved) {
        ft.commit()
    } else if (allowStateLoss) {
        ft.commitAllowingStateLoss()
    }
}