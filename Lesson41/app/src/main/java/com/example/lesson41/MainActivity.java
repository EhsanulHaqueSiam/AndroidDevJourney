package com.example.lesson41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Configuration changes destroy data ( like rotating )
    // private int counter  = 0;

    MainActivityViewModel mainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        // Using Live Data to get the counter
        LiveData<Integer> count = mainActivityViewModel.getInitialCounter();
        count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText("You Clicked Me: "+ integer +" Times");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityViewModel.getCounter();
            }
        });

//        // Getting the initial Count
//        textView.setText("You Clicked Me: "+ mainActivityViewModel.getInitialCounter() +" Times");
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //counter++;
//
//                //textView.setText("You Clicked Me: "+ counter +" Times");
//
//                // Getting the Current Count
//                textView.setText("You Clicked Me: "+ mainActivityViewModel.getCounter() +" Times");
//            }
//        });

    }
}