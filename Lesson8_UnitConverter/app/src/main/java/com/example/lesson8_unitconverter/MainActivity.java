package com.example.lesson8_unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        btn=findViewById(R.id.btn);
        textView= findViewById(R.id.textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting the user input in kilos
                String inputText = editText.getText().toString();
                //Converting a string to double
                double kilos = Double.parseDouble(inputText);
                //Converting a kilos to pounds
                double pounds = makeConversion(kilos);
                //Displaying the conversion result
                textView.setText(Double.toString(pounds));
            }
        });
    }
    public double makeConversion(double kilos){
    // 1 kilo = 2.20462 pounds
        return kilos * 2.20462;
    }
}