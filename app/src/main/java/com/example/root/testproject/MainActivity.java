package com.example.root.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainB_1_clicked(View v) {
        Intent intent = new Intent(this,ReserveActivity.class);
        startActivity(intent);
    }


    public void mainB_2_clicked(View v) {
        ;
    }


    public void mainB_3_clicked(View v) {
        finish();
    }
}