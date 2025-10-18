package com.example.a3096_login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Dashbord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashbord)


val tv_ucapan: TextView = findViewById(R.id.tv_ucapan)

        val username = intent.getStringExtra("nama")
        tv_ucapan.text = "selamat datang! $username"
    }
}