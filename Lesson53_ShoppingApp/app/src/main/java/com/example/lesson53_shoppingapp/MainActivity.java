package com.example.lesson53_shoppingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private DatabaseReference mDatabase;
//    Button btn;
//    EditText editText;
    RecyclerView recyclerView;
    // Firebase
    DatabaseReference database;
    UserAdapter myAdapter;
    ArrayList<ItemModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

////        mDatabase = FirebaseDatabase.getInstance().getReference("GoldPrice").child("price");
////
//////        // Writing Data to Firebase
//////        // Writing a Simple Data ( no custom object )
//////
////////        // Updating the gold Price to 2000 upon launching the app
////////        // Amazing !!!
////////        mDatabase.setValue("2000");
//////
//////        // Not Let's build the Gold Price App
//////        btn = findViewById(R.id.btn);
//////        editText = findViewById(R.id.editTextNumber);
//////
//////        btn.setOnClickListener(new View.OnClickListener() {
//////            @Override
//////            public void onClick(View v) {
//////                mDatabase.setValue(editText.getText().toString());
//////            }
//////        });
////
////        TextView pricetext = findViewById(R.id.goldpriceText);
////
////        // Reading Simple Data from Firebase
////        mDatabase.addValueEventListener(new ValueEventListener() {
////            @Override
////            public void onDataChange(@NonNull DataSnapshot snapshot) {
////                // when any change in the data occurs
////                pricetext.setText(snapshot.getValue().toString());
////
////            }
////
////            @Override
////            public void onCancelled(@NonNull DatabaseError error) {
////
////            }
////        });
//
//        // Writing Custom Objects on Firebase
//        mDatabase = FirebaseDatabase.getInstance().getReference("MyUsers");
//
//        // Widgets
//        Button btn = findViewById(R.id.btn);
//        EditText username = findViewById(R.id.usernameText);
//        EditText password = findViewById(R.id.editText);
//
//        // Don't Miss to:
//        // 1- Add Internet Permission
//        // 2- Add Firebase Database Dependency
//
//
//        // Writing data to firebase
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DataModel user1 = new DataModel
//                        (       username.getText().toString(),
//                                password.getText().toString());
//                mDatabase.setValue(user1);
//            }
//        });

        recyclerView = findViewById(R.id.recyclerView);
        database = FirebaseDatabase.getInstance().getReference("Users");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        myAdapter = new UserAdapter(this, list);
        recyclerView.setAdapter(myAdapter);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();

                for (DataSnapshot dataSnapshot: snapshot.getChildren()) {
                    ItemModel user = dataSnapshot.getValue(ItemModel.class);
                    list.add(user);
                }
                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });





    }
}