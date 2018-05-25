package zhenya.common;

import android.content.Context;
import android.content.Intent;

public interface ISomeNavigation {
    Intent getDetailsIntent(Context context);

    Intent getHomeIntent(Context context);
}
