package com.example.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim)
        btn_alpha.setOnClickListener {
            txt_alpha.startAnimation(alphaAnimation)
        }

        val scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_anim)

        btn_scale.setOnClickListener {
            txt_scale.startAnimation(scaleAnimation)
        }

        val translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_anim)

        btn_translate.setOnClickListener {
            txt_translate.startAnimation(translateAnimation)
        }

        val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)

        btn_rotate.setOnClickListener {
            txt_rotate.startAnimation(rotateAnimation)
        }

        val combinationAnimation = AnimationUtils.loadAnimation(this, R.anim.combination_anim)

        btn_combination.setOnClickListener {
            txt_combination.startAnimation(combinationAnimation)
        }
    }
}