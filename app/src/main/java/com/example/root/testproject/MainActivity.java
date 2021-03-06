package com.example.root.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    DBHandler controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new DBHandler(getApplicationContext());

        if(controller.count_reserveData() == 0){
            controller.init_insertofReserve(6);
        }

        startActivity(new Intent(this, LoginActivity.class));
    }

    //mainB_1 is reservation button
    public void mainB_1_clicked(View v) {
        Intent intent = new Intent(this,ReserveActivity.class);
        startActivity(intent);
    }

    //this button is for admin
    public void mainB_2_clicked(View v) {
        ;
    }

    //quit this app
    public void mainB_3_clicked(View v) {
        finish();
    }
}
