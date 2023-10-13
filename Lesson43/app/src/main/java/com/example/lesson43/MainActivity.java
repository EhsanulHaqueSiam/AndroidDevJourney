package com.example.lesson43;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lesson43.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

//    TextView emailPerson, namePerson;
    private ActivityMainBinding activityMainBinding;
    private MainActivityClickHandlers clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        namePerson  = findViewById(R.id.personName);
//        emailPerson = findViewById(R.id.personEmail);

        Person person1 = new Person("Jack", "Jack@gmail.com");

//        namePerson.setText(person1.getName());
//        emailPerson.setText(person1.getEmail());

        // TextView
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setPerson(person1);

        // Binding the Handler
        clickHandler = new MainActivityClickHandlers(this);
        activityMainBinding.setClickHandler(clickHandler);

    }

    public class MainActivityClickHandlers {
        Context context;

        public MainActivityClickHandlers(Context context) {
            this.context = context;
        }

        // First Button Click Handling
        public void onButton1Click(View view) {
            Toast.makeText(context, "Hello My Friends", Toast.LENGTH_SHORT).show();
        }


        // Second Button CLick Handling
        public void onButton2Click(View view) {
            Toast.makeText(context, "Bye Bye my Friends", Toast.LENGTH_SHORT).show();
        }
    }
}