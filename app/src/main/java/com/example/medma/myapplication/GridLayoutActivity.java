package com.example.medma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        List<String> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            values.add(String.format("Item #%d", i));
        }

        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(new ArrayAdapter<>(this, R.layout.list_view_item, values));
    }
}
