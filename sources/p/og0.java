package p;

import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class og0 {
    public static volatile ScheduledFuture c;
    public static volatile t01 f;
    public static String h;
    public static long i;
    public static int j;
    public static WeakReference k;
    public static String l;
    public static final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static final Object d = new Object();
    public static final AtomicInteger e = new AtomicInteger(0);
    public static final AtomicBoolean g = new AtomicBoolean(false);

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (d) {
            try {
                if (c != null && (scheduledFuture = c) != null) {
                    scheduledFuture.cancel(false);
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final UUID b() {
        t01 t01Var;
        if (f == null || (t01Var = f) == null) {
            return null;
        }
        return (UUID) t01Var.d;
    }

    public static final boolean c() {
        return j == 0;
    }

    public static final void d(Application application, String str) {
        byte b2 = 0;
        if (g.compareAndSet(false, true)) {
            mn10.a(new c9r((byte) 6), kn10.e);
            h = str;
            application.registerActivityLifecycleCallbacks(new ng0(b2));
        }
    }
}
