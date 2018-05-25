package zhenya.secondapp;


import yevhenii.navigation_module.NavigationUtils;
import zhenya.common.INavigationProvider;
import zhenya.common.ISomeNavigation;

public class Application extends android.app.Application implements INavigationProvider {

    private ISomeNavigation navigator = new NavigationUtils();

    @Override
    public ISomeNavigation getNavigator() {
        return navigator;
    }
}

