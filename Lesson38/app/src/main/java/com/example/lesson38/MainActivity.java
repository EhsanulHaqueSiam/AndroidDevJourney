package com.example.lesson38;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);


        // Data to be displayed into gridview
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("The Complete Android Development Course",R.drawable.course1));
        courseModelArrayList.add(new CourseModel("The Complete Java Development Course",R.drawable.course2));
        courseModelArrayList.add(new CourseModel("The Complete Kotlin Development Course",R.drawable.course3));
        courseModelArrayList.add(new CourseModel("The Complete Data Structure and Algorithms Course",R.drawable.course4));

        // Attach the Adapter
        MyAdapter myAdapter = new MyAdapter(this, courseModelArrayList);
        gridView.setAdapter(myAdapter);

    }
}