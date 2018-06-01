package zhenya.common.navigation;

import android.content.Context;
import android.content.Intent;

public interface IDetailsNavigationProvider {
    Intent getDetailsScreenIntent(Context context);
}
