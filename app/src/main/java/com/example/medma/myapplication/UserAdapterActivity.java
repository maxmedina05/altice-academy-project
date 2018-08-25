package com.example.medma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_adapter);

        List<User> users = new ArrayList<>();
        users.add(new User("Max Medina", "Avenida 12, #10" ));
        users.add(new User("Jose Perez", "Avenida 12, #10" ));
        users.add(new User("John Doe", "Avenida 12, #10" ));
        users.add(new User("Nose ", "Avenida 12, #10" ));
        users.add(new User("Maria Perez", "Avenida 12, #10" ));

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(new UserAdapter(this, R.layout.user_list_view, users.toArray(new User[0])));

    }
}
