package p;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h250 extends g5 {
    public int a;
    public WeakReference b;

    public final void onActivityStarted(Activity activity) {
        this.a++;
        this.b = new WeakReference(activity);
    }

    public final void onActivityStopped(Activity activity) {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            this.b = new WeakReference(activity);
        }
    }
}
