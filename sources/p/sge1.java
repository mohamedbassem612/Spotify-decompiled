package p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class sge1 {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static void a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        eg.m("Not running on main thread when it is required to");
    }

    public static void b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}
