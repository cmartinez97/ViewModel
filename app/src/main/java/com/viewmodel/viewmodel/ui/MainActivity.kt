package com.viewmodel.viewmodel.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.viewmodel.viewmodel.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configView()
    }

    private fun configView() {
        mainActivityBtViewModelSumar.setOnClickListener {
            startActivity(Intent(this, ViewModelSumarActivity::class.java))
        }
        mainActivityBtViewModelUser.setOnClickListener {
            startActivity(Intent(this, ViewModelUserActivity::class.java))
        }
    }
}