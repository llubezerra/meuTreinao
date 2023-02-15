package com.cursoandoid.meutreinao.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.cursoandoid.meutreinao.R
import com.cursoandoid.meutreinao.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.light_gray));

        playVideo()
        onRedirectMenu()
    }

    private fun playVideo() {
        val mVideoView: VideoView = binding.GIF
        val uri: Uri = Uri.parse("android.resource://com.cursoandoid.meutreinao/${R.raw.mt_gif}")

        mVideoView.setVideoURI(uri)
        mVideoView.requestFocus()
        mVideoView.start()
    }

    private fun onRedirectMenu() {
        Handler().postDelayed({
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }, 2000)
    }

}