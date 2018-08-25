package com.example.medma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_layout);

        List<String> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            values.add(String.format("Item #%d", i));
        }

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.list_view_item, values));
    }
}
