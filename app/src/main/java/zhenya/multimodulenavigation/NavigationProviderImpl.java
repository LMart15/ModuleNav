package zhenya.multimodulenavigation;

import android.content.Context;
import android.content.Intent;

import yevhenii.detailspage.DetailsActivity;
import yevhenii.homepage.view.ui.HomeActivity;
import zhenya.common.navigation.INavigationProvider;

public class NavigationProviderImpl implements INavigationProvider {

    @Override
    public Intent getDetailsScreenIntent(Context context) {
        return new Intent(context, DetailsActivity.class);
    }

    @Override
    public Intent getHomeScreenIntent(Context context) {
        return new Intent(context, HomeActivity.class);
    }
}
