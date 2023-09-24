package com.example.lesson24_planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planet> planetsArrayList;
    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1- AdapterView: a ListView
        listView=findViewById(R.id.listview);

        // 2- Data Source: ArrayList<Planet>
        planetsArrayList = new ArrayList<>();

        Planet planer1=new Planet("Mercury","0 Moons",R.drawable.mercury);
        Planet planer2=new Planet("Venus","0 Moons",R.drawable.venus);
        Planet planer3=new Planet("Earth","1 Moon",R.drawable.earth);

        Planet planer4=new Planet("Mars","2 Moons",R.drawable.mars);
        Planet planer5=new Planet("Jupiter","79 Moons",R.drawable.jupiter);
        Planet planer6=new Planet("Saturn","83 Moons",R.drawable.saturn);

        Planet planer7=new Planet("Uranus","27 Moons",R.drawable.uranus);
        Planet planer8=new Planet("Neptune","14 Moons",R.drawable.neptune);
        //Planet planer9=new Planet("Pluto","5 Moons",R.drawable.pluto);
        planetsArrayList.add(planer1);
        planetsArrayList.add(planer2);
        planetsArrayList.add(planer3);
        planetsArrayList.add(planer4);
        planetsArrayList.add(planer5);
        planetsArrayList.add(planer6);
        planetsArrayList.add(planer7);
        planetsArrayList.add(planer8);

        //Adapter:
        adapter=new MyCustomAdapter(planetsArrayList,getApplicationContext());
        listView.setAdapter(adapter);

        // Handling Click Events
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(
                        MainActivity.this,
                        "Planet Name: "+adapter.getItem(i).getPlanetName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}