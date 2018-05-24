package yevhenii.detailspage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

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
        tvTitle.setText(getIntent().getStringExtra("tvTitle"));
        tvDescription.setText(getIntent().getStringExtra("tvDescription"));
//        ivPicture.setImageBitmap(getIntent().getParcelableExtra("ivPicture"));
        if(getIntent().hasExtra("ivPicture")) {
            Bitmap b = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra("ivPicture"),0,getIntent()
                            .getByteArrayExtra("ivPicture").length);
            ivPicture.setImageBitmap(b);
        }
    }
}
