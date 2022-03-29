package com.example.myapplication.lab6b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class PotraitFragmentItem extends Fragment {

    List<Shoes> shoesList;
    ListView listView;
    CustomAdapter adapter;

    public PotraitFragmentItem(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        shoesList = new ArrayList<>();
        shoesList.add(new Shoes("Nike shoes", "Please touch to see detail",100.0,R.drawable.shoes_rm_preview));
        shoesList.add(new Shoes("Adidas shoes", "Please touch to see detail",200.0,R.drawable.shoes_rm_preview_a));
        shoesList.add(new Shoes("Nike shoes", "Please touch to see detail",300.0,R.drawable.shoes_rm_preview_b));
        shoesList.add(new Shoes("Nike bicycle shoes", "Please touch to see detail",400.0,R.drawable.shoes_rm_purple));
        shoesList.add(new Shoes("Yonex shoes", "Please touch to see detail",500.0,R.drawable.shoes_rm_yellow));
        shoesList.add(new Shoes("Victor shoes", "Please touch to see detail",600.0,R.drawable.shoes_white_removebg_preview));

        View view = inflater.inflate(R.layout.fragment_potrait_item, container, false);

        adapter = new CustomAdapter(getActivity(), R.layout.potrait_activity_item, shoesList);
        listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return view;
    }

}
