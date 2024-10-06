package com.example.app14.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.example.app14.R;
import com.example.app14.beans.Fruits;

public class FruitsAdapter extends BaseAdapter {
    private List<Fruits> fruits;
    private LayoutInflater inflater;

    public FruitsAdapter(List<Fruits> fruits, Activity activity) {
        this.fruits = fruits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public Object getItem(int position) {
        return fruits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item,null);

        TextView id = convertView.findViewById(R.id.id);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView prix = convertView.findViewById(R.id.prix);
        ImageView image = convertView.findViewById(R.id.photo);

        id.setText(fruits.get(position).getId()+"");
        nom.setText(fruits.get(position).getNom()+"");
        prix.setText(fruits.get(position).getPrix()+"");
        image.setImageResource(fruits.get(position).getImage());
        return convertView;
    }
}
