package zhenya.secondapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import zhenya.common.navigation.INavigation;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = ((INavigation)getApplication()).getNavigationProvider().getHomeScreenIntent(this);
        startActivity(intent);
    }
}
