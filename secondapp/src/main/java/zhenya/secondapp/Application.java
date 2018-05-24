package zhenya.secondapp;


import yevhenii.navigation_module.NavigationUtils;
import zhenya.common.DependencyProvider;
import zhenya.common.SomeNavigation;

public class Application extends android.app.Application implements DependencyProvider {

    private SomeNavigation navigator = new NavigationUtils();

    @Override
    public SomeNavigation getNavigator() {
        return navigator;
    }
}

