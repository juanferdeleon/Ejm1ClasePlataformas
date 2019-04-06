package com.example.ejclase1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import models.MyName

class MainActivity : AppCompatActivity() {

    val myName: MyName = MyName("Name1", "NickName1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
