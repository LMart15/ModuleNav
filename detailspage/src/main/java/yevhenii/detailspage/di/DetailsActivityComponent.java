package yevhenii.detailspage.di;

import dagger.Component;
import yevhenii.detailspage.DetailsActivity;
import zhenya.common.navigation.di.ApplicationProvider;

@Component(
        dependencies = {ApplicationProvider.class},
        modules = {DetailsActivityModule.class}
)
public interface DetailsActivityComponent {

    void inject(DetailsActivity activity);
}
