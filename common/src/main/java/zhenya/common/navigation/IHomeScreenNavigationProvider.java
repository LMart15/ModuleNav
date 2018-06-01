package zhenya.common.navigation;

import android.content.Context;
import android.content.Intent;

public interface IHomeScreenNavigationProvider {
    Intent getHomeScreenIntent(Context context);
}
