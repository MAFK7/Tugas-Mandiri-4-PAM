package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val username =
            findViewById<EditText>(R.id.edit_username)

        val password =
            findViewById<EditText>(R.id.edit_password)

        val buttonLogin =
            findViewById<Button>(R.id.button_login)

        buttonLogin.setOnClickListener {

            val usernameInput =
                username.text.toString()

            val passwordInput =
                password.text.toString()

            if (usernameInput == "admin" &&
                passwordInput == "1111"
            ) {

                val intent =
                    Intent(this, HomeActivity::class.java)

                startActivity(intent)

            } else {

                Toast.makeText(
                    this,
                    "Username atau password salah",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}