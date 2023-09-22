package com.example.lesson22_frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button blackBtn,yellowBtn,purpleBtn,redBtn,greenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blackBtn=findViewById(R.id.blackBtn);
        yellowBtn=findViewById(R.id.yellowBtn);
        purpleBtn=findViewById(R.id.purpleBtn);
        redBtn=findViewById(R.id.redBtn);
        greenBtn=findViewById(R.id.greenBtn);

        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        // Find the button by ID and play the correct sound
        int clickedBtnId= view.getId();

        if (clickedBtnId==R.id.redBtn){
            playSounds(R.raw.red);
        } else if (clickedBtnId==R.id.blackBtn) {
            playSounds(R.raw.black);
        }else if (clickedBtnId==R.id.yellowBtn) {
            playSounds(R.raw.yellow);
        }else if (clickedBtnId==R.id.purpleBtn) {
            playSounds(R.raw.purple);
        }else if (clickedBtnId==R.id.greenBtn) {
            playSounds(R.raw.green);
        }

    }

    public void playSounds(int id){
        MediaPlayer mediaPlayer=MediaPlayer.create(this,id);
        mediaPlayer.start();
    }
}