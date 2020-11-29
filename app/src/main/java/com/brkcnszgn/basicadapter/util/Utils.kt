package com.brkcnszgn.basicadapter.util

import android.content.Context
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mtek.basicadapter.R


object Util {
    fun loadImage(
        view: ImageView,
        url: String?,
        progressDrawable: CircularProgressDrawable?
    ) {
        val options: RequestOptions = RequestOptions()
            .placeholder(progressDrawable)!!
            .error(R.mipmap.ic_launcher_round)
        Glide.with(view.context)
            .setDefaultRequestOptions(options)
            .load(url)
            .into(view)
    }

    fun getProgressDrawable(context: Context?): CircularProgressDrawable {
        val progressDrawable = CircularProgressDrawable(context!!)
        progressDrawable.strokeWidth = 10f
        progressDrawable.centerRadius = 50f
        progressDrawable.start()
        return progressDrawable
    }



}