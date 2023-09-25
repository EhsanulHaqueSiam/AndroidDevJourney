package com.example.lesson27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);

        //Glide Library
        //imageView.setImageResource();//this makes heavy
        //Glide.with(this).load("https://goo.gl/gEgYUd").into(imageView); // reduces memory consumption

        //imageView.setImageResource(R.drawable.logo); //100mb ram cpy 42%
        Glide.with(this)
                .load(R.drawable.logo)
                .into(imageView);

    }
}