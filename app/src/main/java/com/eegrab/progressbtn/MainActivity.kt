package com.eegrab.progressbtn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var view: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view = findViewById(R.id.progressBtnLayout)
        view.setOnClickListener {
            var pb = ProgressButton(this,view)
            pb.ActiveButton()

            Handler().postDelayed({
                pb.FinishButton()
            },3000)
        }
    }
}