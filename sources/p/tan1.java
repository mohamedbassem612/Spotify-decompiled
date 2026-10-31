package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tan1 {
    public static final int a;

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 33554432;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
        }
        a = i2;
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
