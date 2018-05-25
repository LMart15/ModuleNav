package zhenya.multimodulenavigation;

import android.app.Application;

import yevhenii.navigation_module.NavigationUtils;
import zhenya.common.INavigationProvider;
import zhenya.common.ISomeNavigation;

public class CtrApp extends Application implements INavigationProvider {

    private ISomeNavigation navigator = new NavigationUtils();

    @Override
    public ISomeNavigation getNavigator() {
        return navigator;
    }
}

