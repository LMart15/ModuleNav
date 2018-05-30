package yevhenii.detailspage.di.navigation;


import dagger.Component;
import zhenya.common.navigation.di.DetailsScreenNavigationProvider;

@Component(
        modules = {DetailsScreenNavigationModule.class}
)
interface DetailsScreenNavigationComponent extends DetailsScreenNavigationProvider {
}
