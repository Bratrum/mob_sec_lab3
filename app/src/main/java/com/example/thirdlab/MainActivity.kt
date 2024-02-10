package com.example.thirdlab

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BtnBio= findViewById<Button>(R.id.button1)
        val BtnProfile= findViewById<Button>(R.id.button2)
        val BtnCamera= findViewById<Button>(R.id.button3)

        BtnBio.setOnClickListener{
            intent= Intent(applicationContext, Second_screen::class.java)
            startActivity(intent)
        }
        BtnProfile.setOnClickListener {
            val web= Intent(Intent.ACTION_VIEW)
            web.data= Uri.parse("https://www.google.com/")
            startActivity(web)

        }
        BtnCamera.setOnClickListener {
            val camera=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camera)

        }
    }
    }
