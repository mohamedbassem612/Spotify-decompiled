package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qp41 extends g5 implements pp41 {
    public final bp41 a;

    public qp41(bp41 bp41Var) {
        this.a = bp41Var;
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        op71.r(this.a.c.a);
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            activity.unregisterScreenCaptureCallback(this.a);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), this.a);
        } catch (IllegalStateException unused) {
        }
    }
}
