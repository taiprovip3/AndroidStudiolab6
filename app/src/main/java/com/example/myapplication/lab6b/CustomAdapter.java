package com.example.myapplication.lab6b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Shoes> shoesList;

    public CustomAdapter(Context context, LayoutInflater layoutInflater, List<Shoes> shoesList) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.shoesList = shoesList;
    }

    @Override
    public int getCount() {
        return shoesList.size();
    }

    @Override
    public Object getItem(int position) {
        return shoesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.potrait_activity_item, null);
        }

        Shoes shoes = shoesList.get(position);
        TextView viewName = convertView.findViewById(R.id.potraitaName);
        TextView viewDes = convertView.findViewById(R.id.potraitbaDes);
        ImageView viewImage = convertView.findViewById(R.id.potraitaImg);

        String nameShoes = shoes.getNameShoes();
        String desShoes = shoes.getDesShoes();
        int imageShoes = shoes.getImageShoes();

        viewName.setText(nameShoes);
        viewDes.setText(desShoes);
        viewImage.setImageResource(imageShoes);

        return convertView;
    }
}
