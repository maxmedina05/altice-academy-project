package com.example.medma.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(@NonNull Context context, int resource, @NonNull User[] objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User user = getItem(position);

        convertView = (convertView == null) ?
            LayoutInflater.from(getContext()).inflate(R.layout.user_list_view, parent, false) : convertView;

        ((TextView) convertView.findViewById(R.id.txt_name)).setText(user.getName());
        ((TextView) convertView.findViewById(R.id.txt_name)).setText(user.getAddress());

        return convertView;
    }
}
