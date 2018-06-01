package com.olden.gridhomepage.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.olden.gridhomepage.R;
import com.olden.gridhomepage.adapter.GridHomeAdapter;
import com.olden.gridhomepage.adapter.GridHomeViewHolder;

import java.util.Arrays;
import java.util.List;

import zhenya.common.ContinentModel;
import zhenya.common.mock_data.StaticData;
import zhenya.common.navigation.INavigation;

public class GridHomeActivity extends AppCompatActivity implements GridHomeViewHolder.OnItemClickListener {

    private List<ContinentModel> dataSet = Arrays.asList(
            new ContinentModel(StaticData.getImages().get(0), StaticData.getTitles().get(0), StaticData.getDescriptions().get(0)),
            new ContinentModel(StaticData.getImages().get(1), StaticData.getTitles().get(1), StaticData.getDescriptions().get(1)),
            new ContinentModel(StaticData.getImages().get(2), StaticData.getTitles().get(2), StaticData.getDescriptions().get(2)),
            new ContinentModel(StaticData.getImages().get(3), StaticData.getTitles().get(3), StaticData.getDescriptions().get(3)),
            new ContinentModel(StaticData.getImages().get(4), StaticData.getTitles().get(4), StaticData.getDescriptions().get(4)),
            new ContinentModel(StaticData.getImages().get(5), StaticData.getTitles().get(5), StaticData.getDescriptions().get(5)),
            new ContinentModel(StaticData.getImages().get(6), StaticData.getTitles().get(6), StaticData.getDescriptions().get(6))
    );

    private GridHomeAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_home);

        adapter = new GridHomeAdapter(dataSet, this);
        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(int position) {
        ContinentModel item = adapter.getItem(position);

        Intent intent = ((INavigation)getApplication()).getNavigationProvider().getDetailsScreenIntent(this);
        intent.putExtra("Item", item);
        startActivity(intent);
    }
}
