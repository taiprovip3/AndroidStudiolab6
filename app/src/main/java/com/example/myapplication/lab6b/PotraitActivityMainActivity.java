package com.example.myapplication.lab6b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class PotraitActivityMainActivity extends AppCompatActivity {
    ListView listView = this.<ListView>findViewById(R.id.listView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potrait_activity_main);

        List<Shoes> shoesList = new ArrayList<Shoes>();
        shoesList.add(new Shoes("Nike shoes", "Please touch to see detail",100.0,R.drawable.shoes_rm_preview));
        shoesList.add(new Shoes("Adidas shoes", "Please touch to see detail",200.0,R.drawable.shoes_rm_preview_a));.
        shoesList.add(new Shoes("Nike shoes", "Please touch to see detail",300.0,R.drawable.shoes_rm_preview_b));
        shoesList.add(new Shoes("Nike bicycle shoes", "Please touch to see detail",400.0,R.drawable.shoes_rm_purple));
        shoesList.add(new Shoes("Yonex shoes", "Please touch to see detail",500.0,R.drawable.shoes_rm_yellow));
        shoesList.add(new Shoes("Victor shoes", "Please touch to see detail",600.0,R.drawable.shoes_white_removebg_preview));

        CustomAdapter adapter = new CustomAdapter(PotraitActivityMainActivity.this,shoesList);
        listView.setAdapter(adapter);
    }
}