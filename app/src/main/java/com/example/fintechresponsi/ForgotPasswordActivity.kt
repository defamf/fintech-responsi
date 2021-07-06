package com.example.fintechresponsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        btnForgot.setOnClickListener {
            val intent = Intent(this@ForgotPasswordActivity, LoginActivity::class.java)
            startActivity(intent)
        }
        ivBack.setOnClickListener{
            val intent = Intent(this@ForgotPasswordActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}