package com.example.firebase_crud1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryVH extends RecyclerView.ViewHolder
{
    public TextView txt_name,txt_continent,txt_option;
    public CountryVH(@NonNull View itemView)
    {
        super(itemView);
        txt_name = itemView.findViewById(R.id.txt_name);
        txt_continent = itemView.findViewById(R.id.txt_continent);
        txt_option = itemView.findViewById(R.id.txt_option);
    }
}
