package com.deeppowercrew.findoutaboutanumber.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deeppowercrew.findoutaboutanumber.R
import com.deeppowercrew.findoutaboutanumber.numbers.presentation.NumbersFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, NumbersFragment())
            .commit()
    }
}