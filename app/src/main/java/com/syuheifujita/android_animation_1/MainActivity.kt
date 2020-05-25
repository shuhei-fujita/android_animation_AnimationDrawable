package com.syuheifujita.android_animation_1

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var rocketAnimation: AnimationDrawable
    private lateinit var rocketAnimation2: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rocketImage = findViewById<ImageView>(R.id.iv_arrow).apply {
            setBackgroundResource(R.drawable.rocket_thrust)
            rocketAnimation = background as AnimationDrawable
        }

        val rocketImage2 = findViewById<ImageView>(R.id.iv_arrow_2).apply {
            setBackgroundResource(R.drawable.rocket_thrust_2)
            rocketAnimation2 = background as AnimationDrawable
        }

        rocketImage.setOnClickListener {
            rocketAnimation.start()
        }

        rocketImage2.setOnClickListener {
            rocketAnimation2.start()
        }
    }
}
