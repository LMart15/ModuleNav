package yevhenii.homepage.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import yevhenii.hopepage.R;

public class HomeViewHolder extends RecyclerView.ViewHolder {

     public ImageView ivPicture;
     public TextView tvTitle;
     public TextView tvDescription;

    public HomeViewHolder(View itemView, OnItemClickListener listener) {
        super(itemView);

        ivPicture = itemView.findViewById(R.id.ivPicture);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvDescription = itemView.findViewById(R.id.tvDescription);
        itemView.setOnClickListener(view -> listener.onItemClick(getAdapterPosition()));
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
