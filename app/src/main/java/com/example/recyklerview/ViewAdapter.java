package com.example.recyklerview;

import android.annotation.SuppressLint;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private ArrayList<String> foodList;

    public ViewAdapter(ArrayList<String> foodList) {
        this.foodList = foodList;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new FoodViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.id.tv_food,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
    holder.bind(foodList.get(position));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
