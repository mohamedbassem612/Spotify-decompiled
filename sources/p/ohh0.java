package p;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ohh0 {
    public static final /* synthetic */ int b = 0;
    public final mhh0 a;

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public ohh0(Context context, ComponentName componentName, yu3 yu3Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new nhh0(context, componentName, yu3Var);
        } else {
            this.a = new mhh0(context, componentName, yu3Var);
        }
    }
}
