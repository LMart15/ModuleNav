package yevhenii.detailspage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import zhenya.common.navigation.IShowDetailScreen;

public class ShowDetailScreenImpl implements IShowDetailScreen {

    @Override
    public void show(Context context, Bundle bundle) {
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
