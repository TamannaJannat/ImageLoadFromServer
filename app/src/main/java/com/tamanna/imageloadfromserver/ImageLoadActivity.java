package com.tamanna.imageloadfromserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageLoadActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_load);

        imageView = findViewById(R.id.imageView);

        Glide.with(this)
                .load("https://image.shutterstock.com/image-photo/blue-tit-parus-caeruleus-single-450w-145958516.jpg")
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(imageView);
    }
}
