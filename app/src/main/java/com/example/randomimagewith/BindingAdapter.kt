package com.example.randomimagewith

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import soup.neumorphism.NeumorphImageView

@BindingAdapter("imgUrl")
fun show(iv: ImageView, url: String) {
    Glide
        .with(iv.context)
        .load(url)
        .placeholder(R.drawable.loading_animation)
        .into(iv)
}

//"https://picsum.photos/1000?rand=" + System.currentTimeMillis()
