package com.dewari.ajay.ajay_indihoodapplication.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.DetailsItemViewHolder>{


    @NonNull
    @Override
    public DetailsItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class DetailsItemViewHolder extends ViewHolder{
    public DetailsItemViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}

}
