package com.example.belajarmobile

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.content.Context
import kotlinx.android.synthetic.main.*
import android.os.Bundle
import kotlinx.android.synthetic.main.dashboard.*
import android.R
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    val CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        jumlah.setOnClickListener {
            val intent = Intent(getContext(), SecondActivity::class.java)
            startActivity(intent)
        }

    }

}
