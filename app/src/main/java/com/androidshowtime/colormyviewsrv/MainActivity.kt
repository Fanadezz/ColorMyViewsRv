package com.androidshowtime.colormyviewsrv

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

setListeners()
    }


    private fun makeColored(view: View) {

        when (view.id) {


            //Boxes using Color class color for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)


            //Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)

            else -> view.setBackgroundResource(android.R.color.holo_green_light)

        }

    }


    fun setListeners() {

        val views = mutableListOf(
                box_one_text, box_two_text, box_three_text, box_four_text, box_five_text)


        for (view in views){


            view.setOnClickListener { makeColored(it) }
        }
    }

}