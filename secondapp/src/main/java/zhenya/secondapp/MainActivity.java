package zhenya.secondapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import zhenya.common.INavigationProvider;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent homeIntent = ((INavigationProvider)getApplication()).getNavigator().getHomeIntent(this);
        startActivity(homeIntent);
    }
}
