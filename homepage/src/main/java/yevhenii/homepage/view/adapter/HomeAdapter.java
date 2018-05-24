package yevhenii.homepage.view.adapter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;
import java.util.List;

import yevhenii.homepage.service.model.ContinentModel;
import yevhenii.hopepage.R;
import zhenya.common.Constants;
import zhenya.common.Dependencies;
import zhenya.common.DependencyProvider;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<ContinentModel> dataSet;

    public HomeAdapter(List<ContinentModel> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
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

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivPicture;
        private TextView tvTitle;
        private TextView tvDescription;

        public ViewHolder(View itemView) {
            super(itemView);

            ivPicture = itemView.findViewById(R.id.ivPicture);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            itemView.setOnClickListener(view -> {
                DependencyProvider provider = Dependencies.getProvider(view.getContext());
                Intent intent = provider.getNavigator().getDetailsIntent(view.getContext());
//                Intent intent = new Intent(Constants.DETAILS_ACTIVITY); //using Implicit Intent

                Bitmap bitmap = ((BitmapDrawable) ivPicture.getDrawable()).getBitmap();
                ByteArrayOutputStream bs = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);
                intent.putExtra("ivPicture", bs.toByteArray());
                intent.putExtra("tvTitle", tvTitle.getText());
                intent.putExtra("tvDescription", tvDescription.getText());
                view.getContext().startActivity(intent);
            });
        }
    }
}
