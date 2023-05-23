package com.hftamayo.kotlinuserscrud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UsersListAdapter extends RecyclerView.Adapter<UsersListAdapter.UsersViewHolder> {
    private Context context;
    private ArrayList name_id, email_id, age_id;

    public UsersListAdapter(Context context, ArrayList name_id, ArrayList email_id, ArrayList age_id) {
        this.context = context;
        this.name_id = name_id;
        this.email_id = email_id;
        this.age_id = age_id;
    }

    @NonNull
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.userentry,parent,false);
        return new UsersViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class UsersViewHolder extends RecyclerView.ViewHolder {
        TextView name_id, email_id, age_id;
        public UsersViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    };

}
