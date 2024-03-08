package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var userName: EditText
    lateinit var pw: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        userName = findViewById(R.id.username)
        pw = findViewById(R.id.password)
        loginButton = findViewById(R.id.login_button)

        loginButton.setOnClickListener{
            val username = userName.text.toString()
            val password = pw.text.toString()
            Log.i("Test Credentials","Username: $username and Password: $password")

            if(username == "admin" && password == "admin"){
                startActivity(Intent(this,AdminActivity::class.java))
            }else{
                val toast = Toast.makeText(this, "Kullanıcı Adı Veya Şifre Yanlış!", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}