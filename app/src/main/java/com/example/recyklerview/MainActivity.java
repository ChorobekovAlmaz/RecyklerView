package com.example.recyklerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String>foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
    }
    private void loadData() {
        foodList=new ArrayList<>();
        foodList.add("Hello");
        foodList.add("ccx");
        foodList.add("cx");
        foodList.add("Hello");
        foodList.add("Hello");
        foodList.add("Hello");
        foodList.add("Hello");
        foodList.add("Hello");
        foodList.add("Hello");
        foodList.add("Hello");
        foodList.add("Hello");
        foodList.add("Hello");
        foodList.add("Hellod");
    }
}