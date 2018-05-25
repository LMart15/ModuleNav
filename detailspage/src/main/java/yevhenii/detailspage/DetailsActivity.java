package yevhenii.detailspage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import zhenya.common.ContinentModel;

public class DetailsActivity extends AppCompatActivity {

    private ImageView ivPicture;
    private TextView tvTitle;
    private TextView tvDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ivPicture = findViewById(R.id.ivPicture);
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);

        ContinentModel item = getIntent().getExtras().getParcelable("Item");


        tvTitle.setText(item.getTitle());
        tvDescription.setText(item.getDescription());
        Picasso.with(this)
                .load(item.getImage())
                .into(ivPicture);
    }
}
