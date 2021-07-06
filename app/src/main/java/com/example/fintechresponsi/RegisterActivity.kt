package com.example.fintechresponsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister.setOnClickListener {
            val intent = Intent(this@RegisterActivity, DashboardActivity::class.java)
            startActivity(intent)
        }

        ivBack.setOnClickListener {
            val intent = Intent(this@RegisterActivity, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}