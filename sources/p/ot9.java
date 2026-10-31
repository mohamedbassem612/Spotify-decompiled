package p;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ot9 extends g5 {
    public final p4a1 a;
    public final n36 b = new n36();
    public int c = 1;
    public WeakReference d;

    public ot9(p4a1 p4a1Var) {
        this.a = p4a1Var;
    }

    public final void a(Activity activity) {
        if (this.c == 2) {
            WeakReference weakReference = this.d;
            Activity activity2 = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity2 == null || activity2.equals(activity)) {
                this.c = 1;
                this.d = null;
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        a(activity);
    }

    public final void onActivityPaused(Activity activity) {
        r7h.a0(this.b, new nt9(activity, (byte) 0));
    }

    public final void onActivityResumed(Activity activity) {
        a(activity);
        nt9 nt9Var = new nt9(activity, (byte) 0);
        n36 n36Var = this.b;
        r7h.a0(n36Var, nt9Var);
        n36Var.addLast(new WeakReference(activity));
    }
}
