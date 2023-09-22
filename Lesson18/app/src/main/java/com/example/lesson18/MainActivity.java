package com.example.lesson18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View
        spinner=findViewById(R.id.spinner);

        //Data Source:
        String[] courses= {"C++","Java","Kotlin","Python"};

        // ArrayAdapter: used to populate the 'Spinner' with
        //               items from a string array resource
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,courses);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
}