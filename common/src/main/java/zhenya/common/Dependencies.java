package zhenya.common;

import android.content.Context;

public class Dependencies {

    public static DependencyProvider getProvider(Context context) {
        return (DependencyProvider) context.getApplicationContext();
    }

}
