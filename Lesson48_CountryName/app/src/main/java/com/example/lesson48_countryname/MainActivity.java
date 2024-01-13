package com.example.lesson48_countryname;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.lesson48_countryname.adapters.CountryAdapter;
import com.example.lesson48_countryname.model.CountryModel;
import com.example.lesson48_countryname.model.Result;
import com.example.lesson48_countryname.service.GetCountryDataService;
import com.example.lesson48_countryname.service.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CountryModel> countries;

    private CountryAdapter countryAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        GetCountries();
    }

    public Object GetCountries() {
        GetCountryDataService getCountryDataService = RetrofitInstance.getService();
        Call<Result> call = getCountryDataService.getResult();

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result = response.body();

                if (result != null && result.getResult() != null) {
                    countries = (ArrayList<CountryModel>) result.getResult();

//                    for (CountryModel c: countries) {
////                        Log.i("TAG", ""+c.getName());
//
//                    }
                    ViewData();
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

        return countries;
    }

    private void ViewData() {
        recyclerView = findViewById(R.id.recyclerView);
        countryAdapter = new CountryAdapter(countries);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(countryAdapter);
    }


}