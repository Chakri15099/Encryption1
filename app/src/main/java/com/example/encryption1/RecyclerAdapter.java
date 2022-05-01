package com.example.encryption1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.userNameViewHolder> {
    private ArrayList<String> userNameList;
    private ArrayList<String> inboxList;
    private Context context;

    public RecyclerAdapter(ArrayList<String> userNameList, ArrayList<String> inboxList, Context context) {
        this.userNameList = userNameList;
        this.inboxList = inboxList;
        this.context = context;
    }

    @NonNull
    @Override
    public userNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_message_card_design, parent, false);
        return new userNameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull userNameViewHolder holder, int position) {
        holder.textViewUserName.setText(userNameList.get(position));
        holder.textViewInbox.setText(inboxList.get(position));
    }

    @Override
    public int getItemCount() {
        return userNameList.size();
    }

    public class userNameViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewUserName, textViewInbox;
        private CardView cardview;

        public userNameViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewUserName = itemView.findViewById(R.id.sendusernameTV);
            textViewInbox = itemView.findViewById(R.id.inboxListTV);

        }
    }
}