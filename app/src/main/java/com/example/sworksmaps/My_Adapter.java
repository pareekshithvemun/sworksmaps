package com.example.sworksmaps;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class My_Adapter extends RecyclerView.Adapter<My_Adapter.MyViewHolder> {

    LayoutInflater inflater;
    List<Orderdetails> orderdetails;

    public My_Adapter(Context context, List<Orderdetails> orderdetails){
        this.inflater = LayoutInflater.from(context);
        this.orderdetails = orderdetails;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.cardview,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.mName.setText(orderdetails.get(position).getMname());
        holder.mAddress.setText(orderdetails.get(position).getMaddress());

    }

    @Override
    public int getItemCount() {
        return orderdetails.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName, mAddress;

        public MyViewHolder(View itemView){
            super(itemView);
            mName = itemView.findViewById(R.id.Name);
            mAddress = itemView.findViewById(R.id.Address);

        }
    }






}
