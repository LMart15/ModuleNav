package yevhenii.homepage.view.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import yevhenii.homepage.service.model.ContinentModel;
import yevhenii.homepage.view.adapter.HomeAdapter;
import yevhenii.hopepage.R;
import zhenya.common.mock_data.StaticData;

public class HomeActivity extends AppCompatActivity {

    private List<ContinentModel> dataSet = Arrays.asList(
            new ContinentModel(StaticData.getImages().get(0), StaticData.getTitles().get(0), StaticData.getDescriptions().get(0)),
            new ContinentModel(StaticData.getImages().get(1), StaticData.getTitles().get(1), StaticData.getDescriptions().get(1)),
            new ContinentModel(StaticData.getImages().get(2), StaticData.getTitles().get(2), StaticData.getDescriptions().get(2)),
            new ContinentModel(StaticData.getImages().get(3), StaticData.getTitles().get(3), StaticData.getDescriptions().get(3)),
            new ContinentModel(StaticData.getImages().get(4), StaticData.getTitles().get(4), StaticData.getDescriptions().get(4)),
            new ContinentModel(StaticData.getImages().get(5), StaticData.getTitles().get(5), StaticData.getDescriptions().get(5)),
            new ContinentModel(StaticData.getImages().get(6), StaticData.getTitles().get(6), StaticData.getDescriptions().get(6))
    );

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new HomeAdapter(dataSet));
    }
}
