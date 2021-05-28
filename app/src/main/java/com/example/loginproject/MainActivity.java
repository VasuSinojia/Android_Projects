package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String y = getIntent().getStringExtra("a");
        String z = getIntent().getStringExtra("b");
        Snackbar.make(findViewById(android.R.id.content), "Successfully Logged In as " + y , Snackbar.LENGTH_LONG).show();

        lv = findViewById(R.id.lv);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Name : "+y);
        arrayList.add("Email : "+z);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        lv.setAdapter(arrayAdapter);



    }

}