package com.example.medma.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_linear_layout_vertical).setOnClickListener(this);
        findViewById(R.id.btn_linear_layout_horizontal).setOnClickListener(this);
        findViewById(R.id.btn_list_layout).setOnClickListener(this);
        findViewById(R.id.btn_frame_layout).setOnClickListener(this);
        findViewById(R.id.btn_grid_layout).setOnClickListener(this);
        findViewById(R.id.btn_relative_layout).setOnClickListener(this);
        findViewById(R.id.btn_table_layout).setOnClickListener(this);
        findViewById(R.id.btn_constrain_layout).setOnClickListener(this);
        findViewById(R.id.btn_user_adapter).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.btn_linear_layout_vertical:
                intent = new Intent(this, LinearLayoutVerticalActivity.class);
                break;

            case R.id.btn_linear_layout_horizontal:
                intent = new Intent(this, LinearLayoutHorizontalActivity.class);
                break;

            case R.id.btn_list_layout:
                intent = new Intent(this, ListLayoutActivity.class);
                break;

            case R.id.btn_frame_layout:
                intent = new Intent(this, FrameLayoutActivity.class);
                break;

            case R.id.btn_grid_layout:
                intent = new Intent(this, GridLayoutActivity.class);
                break;

            case R.id.btn_table_layout:
                intent = new Intent(this, TableLayoutActivity.class);
                break;

            case R.id.btn_relative_layout:
                intent = new Intent(this, RelativeLayoutActivity.class);
                break;

            case R.id.btn_constrain_layout:
                intent = new Intent(this, ConstrainLayoutActivity.class);
                break;

            case R.id.btn_user_adapter:
                intent = new Intent(this, UserAdapterActivity.class);
                break;
            default:
                    intent = new Intent(this, LinearLayoutVerticalActivity.class);
        }
        startActivity(intent);
    }
}
