package p;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eon1 implements Application.ActivityLifecycleCallbacks {
    public final utw0 a;
    public zve0 b;

    public eon1(utw0 utw0Var) {
        this.a = utw0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        th30 th30VarE0;
        Window window = activity.getWindow();
        String simpleName = activity.getClass().getSimpleName();
        utw0 utw0Var = this.a;
        window.setCallback(new ypn1(window.getCallback(), new a6n1(window, simpleName, utw0Var)));
        zve0 zve0Var = new zve0(utw0Var, (byte) 1);
        this.b = zve0Var;
        dg30 dg30Var = activity instanceof dg30 ? (dg30) activity : null;
        if (dg30Var == null || (th30VarE0 = dg30Var.e0()) == null) {
            return;
        }
        th30VarE0.p.K(zve0Var, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        th30 th30VarE0;
        zve0 zve0Var = this.b;
        if (zve0Var != null) {
            dg30 dg30Var = activity instanceof dg30 ? (dg30) activity : null;
            if (dg30Var == null || (th30VarE0 = dg30Var.e0()) == null) {
                return;
            }
            th30VarE0.p.M(zve0Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
