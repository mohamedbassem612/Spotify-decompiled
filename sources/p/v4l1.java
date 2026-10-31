package p;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v4l1 {
    static {
        qs10.c("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
        synchronized (w4l1.a) {
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
