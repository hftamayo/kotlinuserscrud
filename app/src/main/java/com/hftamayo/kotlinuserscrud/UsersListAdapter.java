package com.hftamayo.kotlinuserscrud;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UsersListAdapter extends RecyclerView.Adapter<UsersListAdapter.UsersViewHolder> {
    private Context contex;
    private ArrayList name_id, email_id, age_id;

    public UsersListAdapter(Context contex, ArrayList name_id, ArrayList email_id, ArrayList age_id) {
        this.contex = contex;
        this.name_id = name_id;
        this.email_id = email_id;
        this.age_id = age_id;
    }

    @NonNull
    @Override
    public UsersListAdapter.UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    }

    @Override
    public void onBindViewHolder(@NonNull UsersListAdapter.UsersViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class UsersViewHolder extends RecyclerView.ViewHolder {
        public UsersViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }:

}
