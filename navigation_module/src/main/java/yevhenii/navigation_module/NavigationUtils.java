package yevhenii.navigation_module;

import android.content.Context;
import android.content.Intent;

import yevhenii.detailspage.DetailsActivity;
import zhenya.common.SomeNavigation;

public class NavigationUtils implements SomeNavigation{

    @Override
    public Intent getDetailsIntent(Context context) {
        return new Intent(context, DetailsActivity.class);
    }
}
