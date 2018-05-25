package yevhenii.navigation_module;

import android.content.Context;
import android.content.Intent;

import yevhenii.detailspage.DetailsActivity;
import yevhenii.homepage.view.ui.HomeActivity;
import zhenya.common.ISomeNavigation;

public class NavigationUtils implements ISomeNavigation {

    @Override
    public Intent getDetailsIntent(Context context) {
        return new Intent(context, DetailsActivity.class);
    }

    @Override
    public Intent getHomeIntent(Context context) {
        return new Intent(context, HomeActivity.class);
    }
}
