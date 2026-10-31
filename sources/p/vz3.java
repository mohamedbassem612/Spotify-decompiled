package p;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vz3 {
    public static final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public static String b;
    public static volatile boolean c;

    public static void a() {
        if (c) {
            return;
        }
        a.writeLock().lock();
        try {
            if (!c) {
                b = PreferenceManager.getDefaultSharedPreferences(wf10.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                c = true;
            }
        } finally {
            a.writeLock().unlock();
        }
    }
}
