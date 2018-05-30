package yevhenii.homepage;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import yevhenii.hopepage.R;
import zhenya.common.ContinentModel;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {

    private List<ContinentModel> dataSet;
    private HomeViewHolder.OnItemClickListener listener;

    public HomeAdapter(List<ContinentModel> dataSet, HomeViewHolder.OnItemClickListener listener) {
        this.dataSet = dataSet;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new HomeViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
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
