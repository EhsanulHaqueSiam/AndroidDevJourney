package com.example.lesson13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intents: facilitate communication bet. different components of an app
        //         as well as bet. different applications.

        //Type of intents:
        //1- Explicit intents

        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecondActivity();
            }
        });

        //2- Implicit Intents

        Button btn2 = findViewById(R.id.openBrowser);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebPage();
            }
        });

    }

    public void goToSecondActivity(){
        Intent intent=new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
    public void openWebPage(){
        //Uri Uniform Resource Identifier (compact string representation used to identify a resource
        // such as a file , content or web address
        Uri webpage = Uri.parse("https://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }
}