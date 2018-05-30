package zhenya.multimodulenavigation;

import android.app.Application;

import yevhenii.detailspage.di.navigation.DaggerDetailsScreenNavigationComponent;
import zhenya.common.navigation.App;
import zhenya.common.navigation.di.ApplicationProvider;
import zhenya.common.navigation.di.DetailsScreenNavigationProvider;
import zhenya.multimodulenavigation.di.DaggerAppComponent;

public class CtrApp extends Application implements App {


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public ApplicationProvider getAppComponent() {

        DetailsScreenNavigationProvider detailsScreenNavigationProvider = DaggerDetailsScreenNavigationComponent.builder().build();

        return DaggerAppComponent.builder()
                .detailsScreenNavigationProvider(detailsScreenNavigationProvider)
                .build();
    }
}

