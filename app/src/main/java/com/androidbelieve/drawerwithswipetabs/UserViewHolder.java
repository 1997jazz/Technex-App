package com.androidbelieve.drawerwithswipetabs;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jazz on 17/9/16.
 */
public class UserViewHolder extends RecyclerView.ViewHolder {
    CardView cardView;
    TextView name_entry, email_entry, icon_entry;

    UserViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.cv);
        name_entry = (TextView) itemView.findViewById(R.id.data1);
        email_entry = (TextView) itemView.findViewById(R.id.data2);
        icon_entry = (TextView) itemView.findViewById(R.id.eventimg);
    }
}