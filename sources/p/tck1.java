package p;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tck1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final HashMap d = new HashMap();
    public final WeakReference a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean c = new AtomicBoolean(false);

    public tck1(Activity activity) {
        this.a = new WeakReference(activity);
    }

    public final void a() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Runnable v241Var = new v241(this, (byte) 19);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                v241Var.run();
            } else {
                this.b.post(v241Var);
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
