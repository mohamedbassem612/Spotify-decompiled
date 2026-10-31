package p;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o6o1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ u6o1 a;

    public o6o1(u6o1 u6o1Var) {
        this.a = u6o1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.a(new h5o1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.a(new p5o1(this, activity, (byte) 3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.a(new p5o1(this, activity, (byte) 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.a.a(new p5o1(this, activity, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        cvn1 cvn1Var = new cvn1();
        this.a.a(new h5o1(this, activity, cvn1Var));
        Bundle bundleD1 = cvn1Var.d1(50L);
        if (bundleD1 != null) {
            bundle.putAll(bundleD1);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.a.a(new pyn1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.a.a(new p5o1(this, activity, (byte) 2));
    }
}
