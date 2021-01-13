package com.eegrab.progressbtn

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class ProgressButton(context: Context, view: View) {
    var layout = view.findViewById<ConstraintLayout>(R.id.constraintlayout)
    var text = view.findViewById<TextView>(R.id.textView)
    var progress = view.findViewById<ProgressBar>(R.id.progressbar)

    fun ActiveButton(){
        progress.visibility = View.VISIBLE
        text.text = "Please wait..."
    }


    fun FinishButton(){
        text.text = "Download Complete"
        progress.visibility = View.GONE
        layout.setBackgroundColor(layout.resources.getColor(R.color.purple_200))
    }
}