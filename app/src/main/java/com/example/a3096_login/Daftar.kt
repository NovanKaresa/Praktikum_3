package com.example.a3096_login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar)


val t_daftar: TextView = findViewById(R.id.tv_daftar)

        t_daftar.text = "selamat datang! mau bikin akun?"
    }
}