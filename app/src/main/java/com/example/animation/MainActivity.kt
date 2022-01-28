package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews(){
        val imageView = findViewById<ImageView>(R.id.iv_simple)

        val bZoom = findViewById<Button>(R.id.b_zoom)
        val bRotate = findViewById<Button>(R.id.b_rotate)
        val bMove = findViewById<Button>(R.id.b_move)
        val bSlide = findViewById<Button>(R.id.b_slide)
        val bFade = findViewById<Button>(R.id.b_fade)
        val bBlink = findViewById<Button>(R.id.b_blink)

        bZoom.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
            imageView.startAnimation(animation)
        }

        bRotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)
            imageView.startAnimation(animation)
        }

        bMove.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext,R.anim.move)
            imageView.startAnimation(animation)
        }

        bSlide.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
            imageView.startAnimation(animation)
        }

        bFade.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
            imageView.startAnimation(animation)
        }

        bBlink.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
            imageView.startAnimation(animation)
        }

    }
}