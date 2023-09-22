package com.example.lesson16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true){
                    //Code to execute when checkbox is checked
                    Toast.makeText(MainActivity.this, "The Checkbox is checked", Toast.LENGTH_SHORT).show();
                }
                else {
                    //Code to execute when checkbox is unchecked
                    Toast.makeText(MainActivity.this, "The Checkbox is not checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}