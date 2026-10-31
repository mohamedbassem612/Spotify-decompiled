package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nd2 extends g5 {
    public Activity a;

    public final void onActivityPaused(Activity activity) {
        if (u890.j(this.a, activity)) {
            this.a = null;
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.a = activity;
    }
}
