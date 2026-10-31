package p;

import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class csd1 {
    public abstract void a(Runnable runnable);

    public final void b(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void d(Runnable runnable);
}
