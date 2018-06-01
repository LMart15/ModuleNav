package zhenya.secondapp;

import android.content.Context;
import android.content.Intent;

import com.olden.gridhomepage.ui.GridHomeActivity;

import yevhenii.detailspage.DetailsActivity;
import zhenya.common.navigation.INavigationProvider;

public class NavigationProviderImpl implements INavigationProvider {

    @Override
    public Intent getDetailsScreenIntent(Context context) {
        return new Intent(context, DetailsActivity.class);
    }

    @Override
    public Intent getHomeScreenIntent(Context context) {
        return new Intent(context, GridHomeActivity.class);
    }
}
