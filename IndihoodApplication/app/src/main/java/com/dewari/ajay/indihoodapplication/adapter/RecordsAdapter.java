package com.dewari.ajay.indihoodapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.dewari.ajay.myapp.R;
import com.dewari.ajay.myapp.model.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.ResultItemViewHolder> {

    private List<Item> resultItems;
    private OnItemClickListener itemClickListener;

    public SearchResultAdapter(List<Item> resultItems) {
        this.resultItems = resultItems;
    }

    class ResultItemViewHolder extends RecyclerView.ViewHolder {

        final View itemView;
        TextView title, snippet;
        ImageView resultImage;

        ResultItemViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            title = this.itemView.findViewById(R.id.title);
            snippet = this.itemView.findViewById(R.id.snippet);
            resultImage = this.itemView.findViewById(R.id.result_image_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (null != itemClickListener && position != RecyclerView.NO_POSITION) {
                        itemClickListener.onItemClick(resultItems.get(position));
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Item note);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.itemClickListener = listener;
    }

    @Override
    public ResultItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.result_item_row, parent, false);
        return new ResultItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResultItemViewHolder holder, int position) {
        Item resultItem = resultItems.get(position);
        if (null != resultItem.getPagemap() && null != resultItem.getPagemap().getCseImage()) {
            String imageSrc = resultItem.getPagemap().getCseImage().get(0).getImageSource();
            Picasso.get()
                    .load(imageSrc)
                    .into(holder.resultImage);
        }
        holder.title.setText(resultItem.getTitle());
        holder.snippet.setText(resultItem.getSnippet());

    }

    @Override
    public int getItemCount() {
        return resultItems.size();
    }
}
