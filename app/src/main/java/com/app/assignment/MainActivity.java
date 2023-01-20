package com.app.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items=new ArrayList<item>();
        items.add(new item("PLU","1"));
        items.add(new item("Chicken Curry Cut","  "));
        items.add(new item("Tare","5g"));
        items.add(new item("MRP","₹299.0"));
        items.add(new item("Weight","0g"));
        items.add(new item("Price","₹0"));

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            GridLayoutManager layoutManager = new GridLayoutManager(this,2);

            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
        }
        else {
            GridLayoutManager layoutManager = new GridLayoutManager(this,1);

            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
        }





    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        // first parameter is the file for icon and second one is menu
        return super.onCreateOptionsMenu(menu);
    }
}