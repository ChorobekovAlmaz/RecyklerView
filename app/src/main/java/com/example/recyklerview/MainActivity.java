package com.example.recyklerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String>foodList;
    private FoodAdapter adapter;
    private RecyclerView recyklerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyklerView=findViewById(R.id.recykler_view);
        loadData();
        adapter=new FoodAdapter(foodList);
        recyklerView.setAdapter(adapter);
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