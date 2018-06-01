package com.olden.gridhomepage.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.olden.gridhomepage.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import zhenya.common.ContinentModel;

public class GridHomeAdapter extends RecyclerView.Adapter<GridHomeViewHolder> {

    private List<ContinentModel> dataSet;
    private GridHomeViewHolder.OnItemClickListener listener;

    public GridHomeAdapter(List<ContinentModel> dataSet, GridHomeViewHolder.OnItemClickListener listener) {
        this.dataSet = dataSet;
        this.listener = listener;
    }

    @NonNull
    @Override
    public GridHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new GridHomeViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull GridHomeViewHolder holder, int position) {
        holder.tvTitle.setText(dataSet.get(position).getTitle());
        holder.tvDescription.setText(dataSet.get(position).getDescription());
        Picasso.with(holder.itemView.getContext())
                .load(dataSet.get(position).getImage())
                .into(holder.ivPicture);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public ContinentModel getItem(int position) {
        return dataSet.get(position);
    }
}
