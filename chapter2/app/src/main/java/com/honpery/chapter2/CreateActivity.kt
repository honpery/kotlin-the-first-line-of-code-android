package com.honpery.chapter2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CreateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        findViewById(R.id.save_btn).setOnClickListener {
        }
    }
}
