package p;

import android.os.Build;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tee1 {
    public static final tee1 a = new tee1();

    public final void a(RemoteViews remoteViews, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setInt(i, "setGravity", i2);
            return;
        }
        throw new IllegalArgumentException(("setGravity is only available on SDK 31 and higher").toString());
    }
}
