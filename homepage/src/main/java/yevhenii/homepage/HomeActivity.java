package yevhenii.homepage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import yevhenii.homepage.di.DaggerHomeScreenComponent;
import yevhenii.hopepage.R;
import zhenya.common.ContinentModel;
import zhenya.common.StaticData;
import zhenya.common.navigation.App;
import zhenya.common.navigation.IShowDetailScreen;

public class HomeActivity extends AppCompatActivity implements HomeViewHolder.OnItemClickListener {

    private List<ContinentModel> dataSet = Arrays.asList(
            new ContinentModel(StaticData.getImages().get(0), StaticData.getTitles().get(0), StaticData.getDescriptions().get(0)),
            new ContinentModel(StaticData.getImages().get(1), StaticData.getTitles().get(1), StaticData.getDescriptions().get(1)),
            new ContinentModel(StaticData.getImages().get(2), StaticData.getTitles().get(2), StaticData.getDescriptions().get(2)),
            new ContinentModel(StaticData.getImages().get(3), StaticData.getTitles().get(3), StaticData.getDescriptions().get(3)),
            new ContinentModel(StaticData.getImages().get(4), StaticData.getTitles().get(4), StaticData.getDescriptions().get(4)),
            new ContinentModel(StaticData.getImages().get(5), StaticData.getTitles().get(5), StaticData.getDescriptions().get(5)),
            new ContinentModel(StaticData.getImages().get(6), StaticData.getTitles().get(6), StaticData.getDescriptions().get(6))
    );

    private HomeAdapter adapter;

    @Inject
    IShowDetailScreen showDetailScreenAction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        adapter = new HomeAdapter(dataSet, this);
        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        DaggerHomeScreenComponent.builder()
                .applicationProvider(((App) getApplication()).getAppComponent())
                .build()
                .inject(this);

    }


    @Override
    public void onItemClick(int position) {
        ContinentModel item = adapter.getItem(position);

        Bundle bundle = new Bundle();
        bundle.putParcelable("Item", item);

        showDetailScreenAction.show(this, bundle);
    }
}
