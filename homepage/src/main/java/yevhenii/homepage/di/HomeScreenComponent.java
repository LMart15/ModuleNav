package yevhenii.homepage.di;

import dagger.Component;
import yevhenii.homepage.HomeActivity;
import zhenya.common.navigation.di.ApplicationProvider;

@Component(
        dependencies = {ApplicationProvider.class},
        modules = {HomeScreenModule.class}
)
public interface HomeScreenComponent {

    void inject(HomeActivity activity);
}
