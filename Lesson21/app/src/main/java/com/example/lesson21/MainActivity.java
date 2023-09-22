package com.example.lesson21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ProgressBar progressBar;
    int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        progressBar=findViewById(R.id.progressbar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress=progress+10;
                progressBar.setProgress(progress);
            }
        });
    }
}