package p;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class zz5 {
    public static ActivityManager a(Context context) {
        return (ActivityManager) context.getSystemService("activity");
    }
}
