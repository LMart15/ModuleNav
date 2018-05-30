package yevhenii.detailspage.di.navigation;

import dagger.Module;
import dagger.Provides;
import yevhenii.detailspage.ShowDetailScreenImpl;
import zhenya.common.navigation.IShowDetailScreen;

@Module
public class DetailsScreenNavigationModule { //Provides navigation to Details Screen
    @Provides
    public IShowDetailScreen provideShowDetailScreen() {
        return new ShowDetailScreenImpl();
    }

}
