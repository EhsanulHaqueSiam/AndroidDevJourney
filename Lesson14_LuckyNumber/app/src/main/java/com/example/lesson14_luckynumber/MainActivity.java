package com.example.lesson14_luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit_text);
        btn=findViewById(R.id.btn);
        txt=findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=editText.getText().toString();

                //Explicit Intent
                //Intent i = new Intent(this, SecondActivity.class) this doesn't refer to context here
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);

                //Passing the name to SecondActivity
                i.putExtra("name",userName);
                startActivity(i);
            }
        });
    }
}