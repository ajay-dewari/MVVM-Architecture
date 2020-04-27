package com.dewari.ajay.demoapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.CustomViewHolder>  {

    private List<Item> dataList;

    public RecyclerviewAdapter(List<Item> dataList){
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        final View mView;
        TextView txtTitle,txtBody;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            txtTitle = mView.findViewById(R.id.title);
            txtBody = mView.findViewById(R.id.description);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.txtTitle.setText(dataList.get(position).getTitle());
        holder.txtBody.setText(dataList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


}
