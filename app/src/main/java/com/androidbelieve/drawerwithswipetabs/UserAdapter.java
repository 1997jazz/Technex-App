package com.androidbelieve.drawerwithswipetabs;

/**
 * Created by jazz on 17/9/16.
 */

import android.support.v7.widget.RecyclerView;

//package com.androidbelieve.drawerwithswipetabs.recyclerview;

        import android.support.v7.widget.CardView;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import java.util.ArrayList;

class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {
    private ArrayList<User> mDataSet;

    public UsersAdapter(ArrayList<User> mDataSet) {
        this.mDataSet = mDataSet;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false);
        UserViewHolder userViewHolder = new UserViewHolder(v);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.name_entry.setText(mDataSet.get(position).getUser_name());
        holder.email_entry.setText(mDataSet.get(position).getUser_email());
        holder.icon_entry.setText(mDataSet.get(position).getUser_name().toString().charAt(0));
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
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

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
