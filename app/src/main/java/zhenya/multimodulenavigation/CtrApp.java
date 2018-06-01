package zhenya.multimodulenavigation;

import android.app.Application;

import zhenya.common.navigation.INavigation;
import zhenya.common.navigation.INavigationProvider;

public class CtrApp extends Application implements INavigation {

    private INavigationProvider navigator = new NavigationProviderImpl();

    @Override
    public INavigationProvider getNavigationProvider() {
        return navigator;
    }
}

