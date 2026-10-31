package p;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e831 extends g5 {
    public WeakReference a;
    public final dt71 b = mgo1.e(0, 0, 0, 7);

    public final Activity a() {
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReference = this.a;
        if (activity.equals(weakReference != null ? (Activity) weakReference.get() : null)) {
            WeakReference weakReference2 = this.a;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            this.a = null;
        }
        this.b.a(new b831(activity));
    }

    public final void onActivityPaused(Activity activity) {
        WeakReference weakReference = this.a;
        if (activity.equals(weakReference != null ? (Activity) weakReference.get() : null)) {
            WeakReference weakReference2 = this.a;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            this.a = null;
        }
        this.b.a(new c831(activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.a = new WeakReference(activity);
    }
}
