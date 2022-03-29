package com.example.myapplication.lab6b;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private int layoutInflater;
    private List<Shoes> shoesList;

    private List<Boolean> isColor;

    public CustomAdapter(Context context, int layoutInflater, List<Shoes> shoesList) {
        this.context = context;
        this.layoutInflater = layoutInflater;
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
            convertView = LayoutInflater.from(parent.getContext()).inflate(layoutInflater, parent, false);
        }

        Shoes shoes = shoesList.get(position);
        TextView viewName = (TextView) convertView.findViewById(R.id.potraitaName);
        TextView viewDes = (TextView) convertView.findViewById(R.id.potraitbaDes);
        ImageView viewImage = (ImageView) convertView.findViewById(R.id.potraitaImg);

        String nameShoes = shoes.getNameShoes();
        String desShoes = shoes.getDesShoes();
        int imageShoes = shoes.getImageShoes();

        viewName.setText(nameShoes);
        viewDes.setText(desShoes);
        viewImage.setImageResource(imageShoes);

        final ConstraintLayout constraintLayout = (ConstraintLayout) convertView.findViewById(R.id.idView);
        isColor = new ArrayList<>();
        for(int i =0; i<= getCount(); i++) {
            isColor.add(false);
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isColor.get(position) == false) {
                    isColor.set(position, true);
                    view.setBackgroundColor(Color.BLUE);
                }
                else {
                    isColor.set(position, false);
                    view.setBackgroundColor(Color.WHITE);
                }


                Toast.makeText(context, "Bạn vừa chọn đôi giày có giá = $"+shoes.getPriceShoes(), Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
