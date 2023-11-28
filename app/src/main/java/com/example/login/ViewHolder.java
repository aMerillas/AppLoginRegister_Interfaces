package com.example.login;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{
     TextView name;
     ImageView img;
    public ViewHolder(@NonNull View itemView){
        super(itemView);

        name = itemView.findViewById(R.id.itemLabel);
        img = itemView.findViewById(R.id.itemImage);
    }
}
