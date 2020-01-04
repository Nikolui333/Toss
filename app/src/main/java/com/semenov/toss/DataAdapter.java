package com.semenov.toss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    ArrayList<Coins> coins;

    public DataAdapter (ArrayList<Coins> coins){
        this.coins = coins;
    }

    public class DataViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView desc;

        public DataViewHolder(@NonNull View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.coin);
        }
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.img.setImageResource(coins.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return coins.size();
    }


}
