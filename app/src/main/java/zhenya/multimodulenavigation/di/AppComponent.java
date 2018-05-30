package zhenya.multimodulenavigation.di;

import dagger.Component;
import zhenya.common.navigation.di.ApplicationProvider;
import zhenya.common.navigation.di.DetailsScreenNavigationProvider;

@Component(dependencies = {
        DetailsScreenNavigationProvider.class
})
interface AppComponent extends ApplicationProvider {

}
