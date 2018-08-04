package com.darshankomu.bounceinterpolator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imgView = findViewById<ImageView>(R.id.heartImg)

        val mAnimationHeart = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce_anim)

        val heartInterpolator = BounceInterpolatorClass(0.2, 20.0)

        mAnimationHeart.interpolator = heartInterpolator

        imgView.startAnimation(mAnimationHeart)


    }
}
