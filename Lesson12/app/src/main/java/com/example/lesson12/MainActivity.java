package com.example.lesson12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize UI and variables here
        Toast.makeText(this, "onCreate() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Start Animation or UI related Tasks
        Toast.makeText(this, "onStart() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Start Sensors, location update, etc
        Toast.makeText(this, "onResume() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Release Resources , Pause ongoing operations etc
        Toast.makeText(this, "onPause() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Release Resources , Save data etc
        Toast.makeText(this, "onStop() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Perform any necessary Restart tasks
        Toast.makeText(this, "onRestart() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Cleanup resources, finalize tasks, etc
        Toast.makeText(this, "onDestroy() is called", Toast.LENGTH_SHORT).show();
    }
}