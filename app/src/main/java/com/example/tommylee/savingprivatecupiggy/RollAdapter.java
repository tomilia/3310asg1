package com.example.tommylee.savingprivatecupiggy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RollAdapter extends RecyclerView.Adapter<RollAdapter.MyViewHolder> {
    private String[] mDataset;
    private Context mContext;
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView name;
        public TextView fullname;
        public TextView address;
        public MyViewHolder(View v) {
            super(v);

        }
    }
    public RollAdapter(String[] myDataset,Context context) {
        mDataset = myDataset;
        mContext = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RollAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        holder.imageView = (ImageView) view.findViewById(R.id.imageView);
        holder.name = (TextView) view.findViewById(R.id.name);
        holder.fullname = (TextView) view.findViewById(R.id.fullname);
        holder.address = (TextView) view.findViewById(R.id.address);

        return holder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.name.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}