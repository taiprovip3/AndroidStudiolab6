package com.example.myapplication.lab6b;

//import static com.example.myapplication.R.id.listView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class PotraitActivityMainActivity extends AppCompatActivity {
//    ListView listView = this.<ListView>findViewById(R.id.listView);
    private ListView listView;
    List<Shoes> shoesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potrait_activity_main);

        PotraitFragmentItem potraitFragmentItem = new PotraitFragmentItem();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentContainerView, potraitFragmentItem, "TAG GI DAY")
                .commit();
    }
}